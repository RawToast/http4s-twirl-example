package hygiene.services

// import fs2.Task
// import hygiene.Responses.multiAuthorityResponse
// import hygiene.client.JsonClient
// import hygiene.domain.Authority
// import hygiene.services.util.JsonAuthorityParser
// import io.circe.literal._
// import org.mockito.ArgumentMatchers._
// import org.mockito.Mockito._
// import org.scalatest.mockito.MockitoSugar
// import org.scalatest.{Matchers, WordSpec}

object AuthorityServiceSpec
// class AuthorityServiceSpec extends WordSpec with MockitoSugar with Matchers {

//   "AuthService" must {

//     val mockClient = mock[JsonClient]
//     val authorityService = new AuthorityService(mockClient, JsonAuthorityParser)

//     "Aggregate the available authorities" in {

//       when(mockClient.fetch(anyString())).thenReturn(Task.delay(multiAuthorityResponse))
//       val result = authorityService.authorities.unsafeRun()

//       assert(result.nonEmpty)
//       assert(result.head.name == "Aberdeen City")
//     }

//     "Handle Json that does not conform to the expected format" in {
//       import io.circe.literal._

//       when(mockClient.fetch(anyString())).thenReturn(Task.delay(json"""{"authorities" : "turnip" }"""))

//       val resultTask: Task[Seq[Authority]] = authorityService.authorities

//       var result = Seq.empty[Authority]

//       noException should be thrownBy {
//         // Note that unsafe will throw any exceptions that occur
//         result = resultTask.unsafeRun()

//         // As the format is invalid, no authorities will exist
//         assert(result.isEmpty)
//       }
//     }

//     "Ignore any invalid authorities, whilst retaining any valid data" in {
//       // This response has a single valid, and a single invalid response
//       when(mockClient.fetch(anyString())).thenReturn(Task.delay(partiallyValidResponse))

//       val resultTask: Task[Seq[Authority]] = authorityService.authorities

//       noException should be thrownBy {
//         // Note that unsafe will throw any exceptions that occur
//         val result = resultTask.unsafeRun()

//         // Only the valid authority has been retained
//         assert(result.size == 1)
//         assert(result.head.name == "Aberdeenshire")
//       }
//     }
//   }

//   val partiallyValidResponse =
//     json"""{
//   "authorities": [
//     {
//       "LocalAuthorityId": 197,
//       "LocalAuthorityIdCode": "760",
//       "NotAName": "Aberdeen City",
//       "EstablishmentCount": 1761,
//       "SchemeType": 2,
//       "links": [
//         {
//           "rel": "self",
//           "href": "http://api.ratings.food.gov.uk/authorities/197"
//         }
//       ]
//     },
//     {
//       "LocalAuthorityId": 198,
//       "LocalAuthorityIdCode": "761",
//       "Name": "Aberdeenshire",
//       "EstablishmentCount": 1794,
//       "SchemeType": 2,
//       "links": [
//         {
//           "rel": "self",
//           "href": "http://api.ratings.food.gov.uk/authorities/198"
//         }
//       ]
//     }]}"""
// }
