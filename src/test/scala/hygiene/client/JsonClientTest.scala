package hygiene.client

// import com.github.tomakehurst.wiremock._
// import com.github.tomakehurst.wiremock.client.WireMock
// import com.github.tomakehurst.wiremock.client.WireMock._
// import fs2.Task
// import io.circe.Json
// import org.http4s.client.blaze.PooledHttp1Client
// import org.http4s.{DecodeFailure, MalformedMessageBodyFailure, Uri}
// import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach, WordSpec}

object JsonClientTest
// class JsonClientTest extends WordSpec with BeforeAndAfterEach with BeforeAndAfterAll {

//   val testport = 9995
//   val server = new WireMockServer(testport)
//   server.start()
//   WireMock.configureFor(testport)

//   val baseUri = Uri.unsafeFromString(s"http://localhost:$testport")
//   val endpoint = "/json"

//   override def afterEach(): Unit = {
//     server.resetAll()
//   }

//   override def afterAll(): Unit = {
//     server.stop()
//   }

//   "JsonClient" when {

//     val client: JsonClient = new JsonClient(PooledHttp1Client(), baseUri)

//     "the resource returns a successful valid JSON response" must {

//       stubFor(get(endpoint).withHeader("x-api-version", equalTo("2"))
//         .willReturn(okJson("""{ "hello" : "world" }""")))

//       val resultEither: Either[Throwable, Json] = client.fetch(endpoint).unsafeAttemptRun()

//       "return successfully" in {
//         assert(resultEither.isRight)
//       }

//       "return the expected json body" in {
//         import io.circe.optics.JsonPath._

//         resultEither.foreach(json =>
//           assert(root.hello.string.getOption(json).contains("world")))
//       }
//     }

//     "the resource returns failure, but with a valid JSON response" must {

//       stubFor(get(endpoint).withHeader("x-api-version", equalTo("2"))
//         .willReturn(aResponse().withStatus(400)
//           .withHeader("content-type", "application/json")
//           .withBody("""{ "Message": "The request is invalid." }""")))

//       val json: Task[Json] = client.fetch(endpoint)

//       val resultEither: Either[Throwable, Json] = json.unsafeAttemptRun()

//       "return successfully" in {
//         assert(resultEither.isRight)
//       }

//       "with the expected json body" in {
//         import io.circe.optics.JsonPath._

//         resultEither.foreach(json =>
//           assert(root.Message.string.getOption(json).contains("The request is invalid.")))
//       }

//     }

//     "the resource returns a non json error response" must {

//       // This is based on a call to, <http://api.ratings.food.gov.uk/auth>
//       // The service interestingly returns a content type of json, but the data is not json
//       stubFor(get(endpoint).withHeader("x-api-version", equalTo("2"))
//         .willReturn(aResponse().withStatus(404)
//           .withHeader("content-type", "application/json")
//           .withBody("The API 'Version2.auth' doesn't exist")))

//       val resultEither: Either[Throwable, Json] = client.fetch(endpoint).unsafeAttemptRun()

//       "returns an error in the either" in {
//         assert(resultEither.isLeft)
//       }

//       "containing a MalformedMessageBodyFailure" in {
//         val errorOpt = resultEither.swap.toOption

//         assert(errorOpt.isDefined)
//         assert(errorOpt.get.isInstanceOf[DecodeFailure])
//         assert(errorOpt.get.isInstanceOf[MalformedMessageBodyFailure])
//       }
//     }

//   }

// }
