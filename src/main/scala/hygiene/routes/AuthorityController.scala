package hygiene.routes

import hygiene.domain.Authority
import hygiene.services._
import org.http4s.dsl._
import org.http4s.{HttpService, Uri}
import play.twirl.api.Html
import org.http4s.twirl._

class AuthorityController(establishmentService: EstablishmentService, authorityService: AuthorityService) {
  val endpoints: HttpService = HttpService {

    case GET -> Root =>
      val uri = Uri.unsafeFromString("http://api.ratings.food.gov.uk/authorities/basic")
      authorityService
        .authorities
        .map(toIndexHtml)
        .flatMap(Ok(_))

    case GET -> Root / "authority" / IntVar(id) :? AuthoritySizeMatcher(authSize) =>
      // Whilst this works, it may be better to run multiple parallel searches and a page size
      establishmentService.hygieneRatings(id, authSize.getOrElse(100))
        .map(toHtml)
        .flatMap(Ok(_))
  }

  private def toHtml(kv: Map[String, Double]): Html = hygiene.html.authority(kv)

  private def toIndexHtml(kv: Seq[Authority]): Html = hygiene.html.index(kv)

  object AuthoritySizeMatcher extends OptionalQueryParamDecoderMatcher[Int]("authSize")

}