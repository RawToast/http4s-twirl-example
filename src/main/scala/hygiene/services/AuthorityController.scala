package hygiene.services

import hygiene.client.HygieneClient
import hygiene.domain.Authority
import io.circe.Json
import org.http4s.dsl._
import org.http4s.{HttpService, Uri}
import play.twirl.api.Html
import org.http4s.twirl._

class AuthorityController(client: HygieneClient[Json], establishmentParser: EstablishmentParser[Json], formatter: Formatter, authorityParser: AuthorityParser[Json]) {
  val endpoints: HttpService = HttpService {
    case GET -> Root =>
      val uri = Uri.unsafeFromString("http://api.ratings.food.gov.uk/authorities/basic")
      client.fetch(uri)
        .map(authorityParser.summariseAuthorites)
        .map(toIndexHtml)
        .flatMap(Ok(_))
    case GET -> Root / "authority" / IntVar(id) :? AuthoritySizeMatcher(authSize) =>
      // Whilst this works, it may be better to run multiple parallel searches and a page size
      val pageSize: Int = authSize.getOrElse(9999)

      val uri = Uri.unsafeFromString(s"http://api.ratings.food.gov.uk/Establishments?localAuthorityId=${id}&pageSize=${pageSize}")
      client.fetch(uri)
        .map(establishmentParser.countEstablishmentRatings)
        .map(formatter.summariseRatings)
        .map(toHtml)
        .flatMap(Ok(_))
  }

  private def toHtml(kv: Map[String, Double]): Html = hygiene.html.authority(kv)

  private def toIndexHtml(kv: Seq[Authority]): Html = hygiene.html.index(kv)

  object AuthoritySizeMatcher extends OptionalQueryParamDecoderMatcher[Int]("authSize")

}