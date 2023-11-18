package hygiene

// import hygiene.client.JsonClient
// import hygiene.middleware.CachingMiddleware
// import hygiene.routes.AuthorityController
// import hygiene.services.{AuthorityService, EstablishmentService}
// import hygiene.services.util.{JsonAuthorityParser, JsonEstablishmentParser, UniversalRatingsFormatter}
// import org.http4s.Uri
// import org.http4s.client.blaze.PooledHttp1Client
// import org.http4s.server.blaze.BlazeBuilder
// import org.http4s.util.StreamApp

object Server

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
