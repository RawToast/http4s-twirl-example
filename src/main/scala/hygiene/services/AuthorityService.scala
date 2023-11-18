package hygiene.services

import hygiene.domain.Authority

import cats.effect.IO

trait AuthorityService[F[_]]:
  def authorities: F[Seq[Authority]]

// class AuthorityService(client: JsonClient, authorityParser: AuthorityParser[Json])
//   extends ListAuthorities {

//   lazy val logger: Logger = getLogger

//   def authorities: Task[Seq[Authority]] = {
//       client.fetch("/authorities/basic")
//         .map(authorityParser.summariseAuthorites)
//   }

// }

object AuthorityService:
  def apply[F[_]](using ev: AuthorityService[F]): AuthorityService[F] = ev

  def stub(): AuthorityService[IO] =
    new AuthorityService[IO] {
      def authorities = IO.pure(
        Seq(
          Authority(name = "Test Authority", id = 1, establishments = 48),
          Authority("Another Authority", 2, 123),
          Authority("Third Authority", 3, 663),
          Authority("Fourth Authority", 4, 6),
          Authority("Fifth and final authority", 5, 44)
        )
      )
    }
