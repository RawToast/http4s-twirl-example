package hygiene

import java.util.concurrent.Executors

import hygiene.client.JsonClient
import hygiene.services.{AuthorityController, JsonEstablishmentParser, RatingsFormatter}
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp


object Server extends StreamApp {

  // Construct services / inject here
  val client = new JsonClient(PooledHttp1Client())
  val authController = new AuthorityController(client, JsonEstablishmentParser, RatingsFormatter)

  override def main(args: List[String]) = {
    // Unconfigured, will bind to 8080
    BlazeBuilder.bindHttp()
      .withServiceExecutor(Executors.newCachedThreadPool())
      .mountService(authController.endpoints, "/")
      .serve
  }
}
