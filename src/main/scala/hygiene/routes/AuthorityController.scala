package hygiene.routes

import hygiene.domain.Authority
import hygiene.services.AuthorityService
import hygiene.services.HygieneRatings

import cats.Monad
import cats.effect._
import cats.effect.kernel.Async
import cats.implicits._
import io.circe.syntax._
import org.http4s._
import org.http4s.Method.GET
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl
import org.http4s.implicits._

trait Routes[F[_]] {
  val routes: HttpRoutes[F]
}

object AuthorityController:

  def apply[F[_]](using ev: Routes[F]): Routes[F] = ev

  def impl[F[_]: Monad](
    ev: HygieneRatings[F],
    authorityService: AuthorityService[F]
  ): Routes[F] = new Routes[F]:
    val dsl = new Http4sDsl[F] {}
    import dsl._

    val routes = HttpRoutes.of[F] {
      case GET -> Root =>
        authorityService.authorities
          .map(_.asJson)
          .flatMap(Ok(_))

      // case GET -> Root / "authority" / IntVar(id) :? AuthoritySizeMatcher(authSize) =>
      //   // Whilst this works, it may be better to run multiple parallel searches and a page size
      //   ev.hygieneRatings(id, authSize.getOrElse(100))
      //     // .map(_.toJson)
      //     .flatMap(Ok(_))
    }
// class AuthorityController(establishmentService: HygieneRatings, authorityService: ListAuthorities) {
//   val endpoints: HttpService = HttpService {

//     case GET -> Root => {
//       authorityService
//         .authorities
//         .map(toIndexHtml)
//         .flatMap(Ok(_))
//     }

//     case GET -> Root / "authority" / IntVar(id) :? AuthoritySizeMatcher(authSize) =>
//       // Whilst this works, it may be better to run multiple parallel searches and a page size
//       establishmentService.hygieneRatings(id, authSize.getOrElse(100))
//         .map(toHtml)
//         .flatMap(Ok(_))
//   }

//   private def toHtml(kv: Map[String, Double]): Html = hygiene.html.authority(kv)

//   private def toIndexHtml(kv: Seq[Authority]): Html = hygiene.html.index(kv)

//   object AuthoritySizeMatcher extends OptionalQueryParamDecoderMatcher[Int]("authSize")

// }
