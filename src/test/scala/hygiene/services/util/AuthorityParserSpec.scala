package hygiene.services.util

// import hygiene.Responses.multiAuthorityResponse
// import hygiene.domain.Authority
// import org.scalatest.WordSpec

object AuthorityParserSpec
// class AuthorityParserSpec extends WordSpec {
//   import io.circe.literal._

//   "AuthorityParser" when {

//     "creating a summary of authorities" must {

//       "return an empty list when given invalid input" in {
//         val authorites: Seq[Authority] = JsonAuthorityParser.summariseAuthorites(jsonWithDifferentStructure)

//         assert(authorites.isEmpty)
//       }

//       "return a list of authorities when given valid input" in {
//         val authorites: Seq[Authority] = JsonAuthorityParser.summariseAuthorites(multiAuthorityResponse)
//         assert(authorites.nonEmpty)
//         assert(authorites.size == 5)

//         val sorted = authorites.sortBy(_.name)

//         assert(sorted.head.name == "Aberdeen City")
//         assert(sorted.head.id == 197)
//         assert(sorted.head.establishments == 1761)

//         assert(sorted.last.name == "Amber Valley")
//         assert(sorted.last.id == 48)
//         assert(sorted.last.establishments == 967)
//       }

//       "include the authority details" in {
//         val authorites: Seq[Authority] = JsonAuthorityParser.summariseAuthorites(singleAuthorityResponse)
//         assert(authorites.size == 1)
//         assert(authorites.head.name == "Aberdeen City")
//         assert(authorites.head.id == 197)
//         assert(authorites.head.establishments == 1761)
//       }
//     }
//   }

//   val singleAuthorityResponse =
//     json"""{
//   "authorities": [
//     {
//       "LocalAuthorityId": 197,
//       "LocalAuthorityIdCode": "760",
//       "Name": "Aberdeen City",
//       "EstablishmentCount": 1761,
//       "SchemeType": 2,
//       "links": [
//         {
//           "rel": "self",
//           "href": "http://api.ratings.food.gov.uk/authorities/197"
//         }
//       ]
//     }]}"""

//   val jsonWithDifferentStructure = json"""{"message": "hello"}"""
// }
