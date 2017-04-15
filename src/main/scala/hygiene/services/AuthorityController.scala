package hygiene.services

import hygiene.client.HygieneClient
import io.circe.Json
import org.http4s.dsl._
import org.http4s.{HttpService, Uri}
import play.twirl.api.Html
import org.http4s.twirl._

class AuthorityController(client: HygieneClient[Json], establishmentParser: EstablishmentParser[Json], formatter: Formatter) {
  val endpoints: HttpService = HttpService {
    case GET -> Root / "authority" / IntVar(id) =>

      // For now, assume cannot be more than 999
      val uri = Uri.unsafeFromString(s"http://api.ratings.food.gov.uk/Establishments?localAuthorityId=${id}&pageSize=999")

      client.fetch(uri)
        .map(establishmentParser.countEstablishmentRatings)
        .map(formatter.summariseRatings)
        .map(toHtml)
        .flatMap(Ok(_))
  }

  private def toHtml(kv: Map[String, Double]): Html = hygiene.html.authority(kv)
}