package hygiene.services

import java.time.LocalDateTime

import fs2.Task
import hygiene.client.JsonClient
import hygiene.domain.Authority
import io.circe.Json
import org.log4s.{Logger, getLogger}

class AuthorityService(client: JsonClient, authorityParser: AuthorityParser[Json], cacheTimeInSeconds: Long=60L) {

  lazy val logger: Logger = getLogger

  var cache: Option[(LocalDateTime, Seq[Authority])] = None

  private def getFromCache: Option[Task[Seq[Authority]]] = {
    cache match {
      case None => None
      case Some((cachedTime, result)) =>
        if (cachedTime.plusSeconds(cacheTimeInSeconds).isAfter(LocalDateTime.now())) Option(Task.delay(result))
        else None
    }
  }

  def authorities: Task[Seq[Authority]] = {
    val res: Task[Seq[Authority]] = getFromCache.getOrElse {
      client.fetch("/authorities/basic")
        .map(authorityParser.summariseAuthorites)
        .map(res => {
          cache = Some(LocalDateTime.now() -> res); res
        })
    }

    res
  }

}

class EstablishmentService(client: JsonClient,
                           establishmentParser: EstablishmentParser[Json],
                           formatter: Formatter,
                           cacheTimeInSeconds: Long=60L) {

  lazy val logger: Logger = getLogger

  var cache = Map.empty[Int, (LocalDateTime, Map[String, Double])]

  private def getFromCache(i: Int): Option[Task[Map[String, Double]]] = {
    logger.info("Looking at cache")
    cache.get(i) match {
      case None => None
      case Some((cachedTime, result)) =>
        if (cachedTime.plusSeconds(cacheTimeInSeconds).isAfter(LocalDateTime.now())) Option(Task.delay(result))
        else None
    }
  }


  def hygieneRatings(id: Int, establishments: Int): Task[Map[String, Double]] = {
    getFromCache(id).getOrElse {
      logger.info(s"No cached result for authId=$id ")
      client.fetch(s"/Establishments?localAuthorityId=$id&pageSize=$establishments")
        .map(establishmentParser.countEstablishmentRatings)
        .map(formatter.summariseRatings)
        .map(res => {
          cache = cache + Tuple2(id, LocalDateTime.now() -> res); res
        })
    }
  }
}