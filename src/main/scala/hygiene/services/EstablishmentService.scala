package hygiene.services

import fs2.Task
import hygiene.client.JsonClient
import hygiene.services.util.{EstablishmentParser, RatingsFormatter}
import io.circe.Json
import org.log4s.{Logger, getLogger}

trait HygieneRatings {
  def hygieneRatings(id: Int, establishments: Int): Task[Map[String, Double]]
}

class EstablishmentService(client: JsonClient,
                           establishmentParser: EstablishmentParser[Json],
                           formatter: RatingsFormatter) extends HygieneRatings {

  lazy val logger: Logger = getLogger

  def hygieneRatings(id: Int, establishments: Int): Task[Map[String, Double]] = {
    client.fetch(s"/Establishments?localAuthorityId=$id&pageSize=$establishments")
      .map(establishmentParser.countEstablishmentRatings)
      .map(formatter.summariseRatings)
  }
}
