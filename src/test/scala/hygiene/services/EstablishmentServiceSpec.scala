package hygiene.services

// import fs2.Task
// import hygiene.Responses._
// import hygiene.client.JsonClient
// import hygiene.services.util._
// import org.mockito.Mockito._
// import org.scalatest.mockito.MockitoSugar
// import org.scalatest.{Matchers, WordSpec}

object EstablishmentServiceSpec
// class EstablishmentServiceSpec extends WordSpec with MockitoSugar with Matchers {

//   "EstablishmentService" must {

//     val parser = JsonEstablishmentParser
//     val formatter = UniversalRatingsFormatter

//     "Calculate and format ratings" in {
//       val mockClient = mock[JsonClient]
//       val service = new EstablishmentService(mockClient, parser, formatter)

//       when(mockClient.fetch("/Establishments?localAuthorityId=111&pageSize=222"))
//         .thenReturn(Task.delay(validEstablishmentsJson))

//       val result = service.hygieneRatings(111, 222).unsafeRun()

//       assert(result.nonEmpty)
//       assert(result.get("5-star").isDefined)
//     }

//   }

// }
