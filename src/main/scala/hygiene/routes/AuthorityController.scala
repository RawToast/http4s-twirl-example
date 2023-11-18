package hygiene.routes

import hygiene.domain._
import hygiene.services.AuthorityService
import hygiene.services.EstablishmentService

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
    authorityService: AuthorityService[F],
    establishmentService: EstablishmentService[F]
  ): Routes[F] = new Routes[F]:
    val dsl = new Http4sDsl[F] {}
    import dsl._

    object AuthoritySizeMatcher extends OptionalQueryParamDecoderMatcher[Int]("authSize")

    val routes = HttpRoutes.of[F] {
      case GET -> Root =>
        for {
          authorities <- authorityService.authorities
          json         = authorities.asJson
          response    <- Ok(json)
        } yield response

      case GET -> Root / "authority" / IntVar(id) :? AuthoritySizeMatcher(authSize) =>
        // Whilst this works, it may be better to run multiple parallel searches and a page size
        for {
          establishments <- establishmentService.hygieneRatings(id, authSize.getOrElse(100))
          json            = establishments.asJson
          response       <- Ok(json)
        } yield response
    }
