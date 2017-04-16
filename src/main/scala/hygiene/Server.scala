package hygiene

import java.util.concurrent.Executors

import hygiene.client.JsonClient
import hygiene.routes.AuthorityController
import hygiene.services._
import org.http4s.Uri
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp


object Server extends StreamApp {

  // Construct services / inject here
  val hygieneApiUri: Uri = Uri.uri("http://api.ratings.food.gov.uk")
  val client = new JsonClient(PooledHttp1Client(), hygieneApiUri)

  val authorityService = new AuthorityService(client, JsonAuthorityParser)
  val establishmentService = new EstablishmentService(client, JsonEstablishmentParser, RatingsFormatter)

  val authController = new AuthorityController(establishmentService, authorityService)

  override def main(args: List[String]) = {
    // Unconfigured, will bind to 8080
    BlazeBuilder.bindHttp()
      .withServiceExecutor(Executors.newCachedThreadPool())
      .mountService(authController.endpoints, "/")
      .serve
  }
}
