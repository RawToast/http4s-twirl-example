package hygiene

import fs2.Task
import hygiene.services.AuthorityController
import org.http4s.dsl._
import org.http4s.{MaybeResponse, Request, Response, Uri, _}
import org.scalatest.WordSpec



class AuthorityHygieneSpec extends WordSpec {

  "AuthorityService" when {
    val authorityController = new AuthorityController()
    val authService = authorityController.authorityService
    val request = Request(GET, Uri.uri("/authority/1"))

    val maybeResponse: Response = syncFetch(authService.run(request))

    "a local authority is selected" must {

      "return a 200 (Ok) response" in {
        assert(maybeResponse.status == Ok)
      }

      "return a HTML response" in {
        assert(maybeResponse.headers.get("content-type".ci) == Some(Header("Content-Type", "text/html; charset=UTF-8")))
      }

      "include a tabular breakdown for the authority" in {

        val pageTask: Task[String] = maybeResponse.as[String]
        val page = pageTask.unsafeRun()

        assert(page.contains("<table"))
        //Rating Percentage
        assert(page.contains("<th>Rating</th>"))
        assert(page.contains("<th>Percentage</th>"))
        assert(page.contains("<td>5-star</td>"))
        assert(page.contains("<td>4-star</td>"))
        assert(page.contains("<td>3-star</td>"))
        assert(page.contains("<td>2-star</td>"))
        assert(page.contains("<td>1-star</td>"))
        assert(page.contains("<td>Exempt</td>"))
      }
    }
  }

  def syncFetch(r: Task[MaybeResponse]) = {
    // Ideally, we would not call .get on an option as it is unsafe.
    // As this is a test, doing so is permissible here.
    r.unsafeRun().toOption.get
  }
}
