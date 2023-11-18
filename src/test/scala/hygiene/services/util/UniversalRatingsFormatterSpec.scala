package hygiene.services.util

// import org.scalatest.WordSpec

object UniversalRatingsFormatterSpec
// class UniversalRatingsFormatterSpec extends WordSpec {

//   "RatingsFormatter" when {
//     val ratingsFormatter = UniversalRatingsFormatter

//     "Calculating the average ratings" should {

//       "Return an empty map when there are no ratings" in {
//         val ratingsSummary = ratingsFormatter.summariseRatings(Map.empty)
//         assert(ratingsSummary.isEmpty)
//       }

//       "Return all standard categories when provided with a single standard category" in {
//         val ratingsSummary = ratingsFormatter.summariseRatings(Map("5" -> 1))
//         assert(ratingsSummary.size == 7)
//         assert(ratingsSummary.contains("5-star"))
//         assert(ratingsSummary.contains("4-star"))
//         assert(ratingsSummary.contains("3-star"))
//         assert(ratingsSummary.contains("2-star"))
//         assert(ratingsSummary.contains("1-star"))
//         assert(ratingsSummary.contains("0-star"))
//         assert(ratingsSummary.contains("Exempt"))
//       }

//       "Return only exempt category when provided with a only exempt ratings" in {
//         val ratingsSummary = ratingsFormatter.summariseRatings(Map("Exempt" -> 9001))
//         assert(ratingsSummary.size == 1)
//         assert(ratingsSummary.contains("Exempt"))
//       }

//       "Return scottish ratings when provided when a map containing scottish ratings" in {
//         val ratingsSummary = ratingsFormatter.summariseRatings(Map("Awaiting Publication" -> 1, "Improvement Required" -> 1,
//           "Exempt" -> 1, "Awaiting Inspection" -> 1, "Pass" -> 1))

//         assert(ratingsSummary.size == 5)
//         assert(ratingsSummary.contains("Pass"))
//         assert(ratingsSummary.contains("Improvement Required"))
//         assert(ratingsSummary.contains("Awaiting Publication"))
//         assert(ratingsSummary.contains("Awaiting Inspection"))
//         assert(ratingsSummary.contains("Exempt"))
//       }
//     }

//   }

// }
