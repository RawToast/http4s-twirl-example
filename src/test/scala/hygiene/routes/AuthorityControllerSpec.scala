package hygiene.routes

// import fs2.Task
// import hygiene.Responses.{multiAuthorityResponse, scottishEstablishmentsJson, validEstablishmentsJson}
// import hygiene.client.JsonClient
// import hygiene.services._
// import hygiene.services.util.{JsonAuthorityParser, JsonEstablishmentParser, UniversalRatingsFormatter}
// import io.circe.literal._
// import org.http4s.dsl._
// import org.http4s.{MaybeResponse, Request, Response, Uri, _}
// import org.mockito.Mockito._
// import org.scalatest.WordSpec
// import org.scalatest.mockito.MockitoSugar

object AuthorityControllerSpec
// class AuthorityControllerSpec extends WordSpec with MockitoSugar {

//   "AuthorityController" when {

//     val mockClient = mock[JsonClient]

//     def authorityService = new AuthorityService(mockClient, JsonAuthorityParser)
//     val establishmentService = new EstablishmentService(mockClient, JsonEstablishmentParser, UniversalRatingsFormatter)
//     val authorityController = new AuthorityController(establishmentService, authorityService)

//     val authEndpoints = authorityController.endpoints
//     val request = Request(GET, Uri.uri("/authority/1"))

//     "a local authority with no ratings selected" must {
//       when(mockClient.fetch("/Establishments?localAuthorityId=1&pageSize=100"))
//         .thenReturn(Task.now(json"""{}"""))

//       val maybeResponse: Response = syncFetch(authEndpoints.run(request))

//       "return a 200 (Ok) response" in {
//         assert(maybeResponse.status == Ok)
//       }

//       "return a HTML response" in {
//         assert(maybeResponse.headers.get("content-type".ci).contains(Header("Content-Type", "text/html; charset=UTF-8")))
//       }

//       "not include a tabular breakdown for the authority" in {

//         val pageTask: Task[String] = maybeResponse.as[String]
//         val page = pageTask.unsafeRun()

//         assert(!page.contains("<table"))
//         //Rating Percentage
//         assert(!page.contains("<th>Rating</th>"))
//         assert(!page.contains("<th>Percentage</th>"))
//         assert(!page.contains("<td>5-star</td>"))
//         assert(!page.contains("<td>4-star</td>"))
//         assert(!page.contains("<td>3-star</td>"))
//         assert(!page.contains("<td>2-star</td>"))
//         assert(!page.contains("<td>1-star</td>"))
//         assert(!page.contains("<td>Exempt</td>"))

//         assert(page.contains("No establishments found"))
//       }
//     }

//     "a local authority with ratings is selected" must {
//       when(mockClient.fetch("/Establishments?localAuthorityId=1&pageSize=100"))
//         .thenReturn(Task.delay(validEstablishmentsJson))

//       val maybeResponse: Response = syncFetch(authEndpoints.run(request))

//       "return a 200 (Ok) response" in {
//         assert(maybeResponse.status == Ok)
//       }

//       "return a HTML response" in {
//         assert(maybeResponse.headers.get("content-type".ci).contains(Header("Content-Type", "text/html; charset=UTF-8")))
//       }

//       "include a tabular breakdown for the authority" in {

//         val pageTask: Task[String] = maybeResponse.as[String]
//         val page = pageTask.unsafeRun()

//         assert(page.contains("<table"))
//         //Rating Percentage
//         assert(page.contains("<th>Rating</th>"))
//         assert(page.contains("<th>Percentage</th>"))
//         assert(page.contains("<td>5-star</td>"))
//         assert(page.contains("<td>4-star</td>"))
//         assert(page.contains("<td>3-star</td>"))
//         assert(page.contains("<td>2-star</td>"))
//         assert(page.contains("<td>1-star</td>"))
//         assert(page.contains("<td>Exempt</td>"))
//       }
//     }

//     "a scottish authority with ratings is selected" must {
//       when(mockClient.fetch("/Establishments?localAuthorityId=1&pageSize=100"))
//         .thenReturn(Task.delay(scottishEstablishmentsJson))

//       val maybeResponse: Response = syncFetch(authEndpoints.run(request))

//       "return a 200 (Ok) response" in {
//         assert(maybeResponse.status == Ok)
//       }

//       "return a HTML response" in {
//         assert(maybeResponse.headers.get("content-type".ci).contains(Header("Content-Type", "text/html; charset=UTF-8")))
//       }

//       "include a tabular breakdown for the authority" in {

//         val pageTask: Task[String] = maybeResponse.as[String]
//         val page = pageTask.unsafeRun()

//         assert(page.contains("<table"))
//         //Rating Percentage
//         assert(page.contains("<th>Rating</th>"))
//         assert(page.contains("<th>Percentage</th>"))

//         // Scottish ratings
//         assert(page.contains("<td>Pass</td>"))
//         assert(page.contains("<td>Awaiting Publication</td>"))
//         assert(page.contains("<td>Awaiting Inspection</td>"))
//         assert(page.contains("<td>Improvement Required</td>"))
//         assert(page.contains("<td>Exempt</td>"))

//         // No star based ratings
//         assert(!page.contains("-star</td>"))
//       }
//     }

//     "fetching the index page" must {
//       when(mockClient.fetch("/authorities/basic"))
//         .thenReturn(Task.now(multiAuthorityResponse))
//       val request = Request(GET, Uri.uri("/"))
//       val maybeResponse: Response = syncFetch(authEndpoints.run(request))

//       "return a 200 (Ok) response" in {
//         assert(maybeResponse.status == Ok)
//       }
//     }
//   }

//   def syncFetch(r: Task[MaybeResponse]) = {
//     // Ideally, we would not call .get on an option as it is unsafe.
//     // As this is a test, doing so is permissible here.
//     r.unsafeRun().toOption.get
//   }
// }
