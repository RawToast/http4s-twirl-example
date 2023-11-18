package hygiene.views

// import hygiene.domain.Authority
// import org.scalatest.WordSpec
// import org.scalatest.mockito.MockitoSugar

object IndexViewSpec

// class IndexViewSpec extends WordSpec with MockitoSugar {

//   "AuthorityView" when {

//     "rendering with no authorities" must {

//       val renderedHtml = hygiene.html.index(Seq.empty[Authority])

//       "return html content type" in {
//         assert(renderedHtml.contentType == "text/html")
//       }

//       val page = renderedHtml.body

//       "state no authorities were found" in {
//         assert(page.contains("No authorities found"))
//       }

//       "not include a dropdown breakdown for authorities" in {
//         assert(!page.contains("<div class=\"dropdown\">"))
//       }
//     }

//     "rendering with authorities" must {

//       val renderedHtml = hygiene.html.index(Seq(Authority("test", 1, 9999), Authority("test alt", 2, 9999)))

//       "return html content type" in {
//         assert(renderedHtml.contentType == "text/html")
//       }

//       val page = renderedHtml.body

//       "include a dropdown breakdown for authorities" in {
//         assert(page.contains("""<div class="dropdown">"""))
//       }

//       "include rows for each authority in the dropdown" in {
//         assert(page.contains("uri=/authority/1?authSize=9999"))
//         assert(page.contains("uri=/authority/2?authSize=9999"))
//       }
//     }
//   }
// }
