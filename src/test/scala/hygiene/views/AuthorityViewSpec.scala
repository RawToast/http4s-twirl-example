package hygiene.views

// import org.scalatest.WordSpec
// import org.scalatest.mockito.MockitoSugar

// class AuthorityViewSpec extends WordSpec with MockitoSugar {

object AuthorityViewSpec

//   "AuthorityView" when {
//     "rendering with no establishments" must {

//       val renderedHtml = hygiene.html.authority(Map.empty[String, Double])

//       "return html content type" in {
//         assert(renderedHtml.contentType == "text/html")
//       }

//       val page = renderedHtml.body

//       "state no establishments were found" in {
//         assert(page.contains("No establishments found"))
//       }

//       "not include a tabular breakdown for the authority" in {
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
//       }
//     }

//     "a local authority with standard ratings is selected" must {
//       val ratings = Map[String, Double]("5-star" -> 10, "4-star" -> 50,
//         "3-star" -> 0, "2-star" -> 0, "1-star" -> 30, "0-star" -> 0, "Exempt" -> 10)

//       val renderedHtml = hygiene.html.authority(ratings)
//       val page = renderedHtml.body

//       "return html content type" in {
//         assert(renderedHtml.contentType == "text/html")
//       }

//       "include a tabular breakdown for the authority" in {
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

//       "not include scottish ratings" in {
//         // Scottish ratings
//         assert(!page.contains("<td>Pass</td>"))
//         assert(!page.contains("<td>Awaiting Publication</td>"))
//         assert(!page.contains("<td>Awaiting Inspection</td>"))
//         assert(!page.contains("<td>Improvement Required</td>"))
//       }
//     }

//     "a scottish authority with ratings is selected" must {
//       val ratings = Map[String, Double]("Pass" -> 60, "Improvement Required" -> 10, "Exempt" -> 30,
//         "Awaiting Publication" -> 10, "Awaiting Inspection" -> 10)

//       val renderedHtml = hygiene.html.authority(ratings)
//       val page = renderedHtml.body

//       "return html content type" in {
//         assert(renderedHtml.contentType == "text/html")
//       }

//       "include a tabular breakdown for the authority" in {
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
//       }

//       "not include start based ratings" in {
//         // No star based ratings
//         assert(!page.contains("-star</td>"))
//       }
//     }

//   }
// }
