package hygiene

import hygiene.domain.EstablishmentRatings
import hygiene.routes.AuthorityController
import hygiene.services.{AuthorityService, EstablishmentService}

import cats.effect._
import com.comcast.ip4s._
import org.http4s.ember.server._

object Server extends IOApp:

  val authorityService: AuthorityService[IO]         = AuthorityService.stub()
  val establishmentService: EstablishmentService[IO] = EstablishmentService.stub()
  val authorityController                            = AuthorityController.impl[IO](authorityService, establishmentService)
  def run(args: List[String])                        =
    EmberServerBuilder
      .default[IO]
      .withHost(ipv4"0.0.0.0")
      .withPort(port"8080")
      .withHttpApp(authorityController.routes.orNotFound)
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)

// object Server extends StreamApp {

//   // Construct services / inject here
//   val hygieneApiUri: Uri = Uri.uri("http://api.ratings.food.gov.uk")
//   val client = new JsonClient(PooledHttp1Client(), hygieneApiUri)

//   val authorityService = new AuthorityService(client, JsonAuthorityParser)
//   val establishmentService = new EstablishmentService(client, JsonEstablishmentParser, UniversalRatingsFormatter)

//   val authController = new AuthorityController(establishmentService, authorityService)

//   override def stream(args: List[String]) = {
//     // Unconfigured, will bind to 8080
//     BlazeBuilder.bindHttp()
//       .withExecutionContext(scala.concurrent.ExecutionContext.global)
//       .mountService(CachingMiddleware.cacheRoot(authController.endpoints), "/")
//       .serve
//   }
// }
