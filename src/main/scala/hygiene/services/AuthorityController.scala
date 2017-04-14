package hygiene.services

import org.http4s.HttpService
import org.http4s.dsl._
import org.http4s.twirl._
import play.twirl.api.Html

class AuthorityController {

  val authorityService: HttpService = HttpService {
    case GET -> Root / "authority" / IntVar(id) =>

      val ratings = Seq("5-star" -> 50, "4-star" -> 0,
        "3-star" -> 0, "2-star" -> 0, "1-star" -> 25, "Exempt" -> 25)
      val h: Html = hygiene.html.authority(ratings)

      Ok(h)
  }

}
