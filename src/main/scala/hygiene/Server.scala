package hygiene

import java.util.concurrent.Executors

import hygiene.services.AuthorityController
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp


object Server extends StreamApp {

  // Construct services / inject here

  val authService = new AuthorityController()

  override def main(args: List[String]) = {
    // Unconfigured, will bind to 8080
    BlazeBuilder.bindHttp()
      .withServiceExecutor(Executors.newCachedThreadPool())
      .mountService(authService.authorityService, "/")
      .serve
  }
}
