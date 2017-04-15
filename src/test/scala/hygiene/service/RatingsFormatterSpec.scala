package hygiene.service

import hygiene.services.RatingsFormatter
import org.scalatest.WordSpec


class RatingsFormatterSpec extends WordSpec {

  "RatingsFormatter" when {
    val ratingsFormatter = RatingsFormatter

    "Calculating the average ratings" should {

      "Return an empty map when there are no ratings" in {
        val ratingsSummary = ratingsFormatter.summariseRatings(Map.empty)
        assert(ratingsSummary.isEmpty)
      }


      "Return all standard categories when provided with a single standard category" in {
        val ratingsSummary = ratingsFormatter.summariseRatings(Map("5" -> 1))
        assert(ratingsSummary.size == 7)
      }

      "Return all standard categories when provided with a only exempt ratings" in {
        val ratingsSummary = ratingsFormatter.summariseRatings(Map("Exempt" -> 9001))
        assert(ratingsSummary.size == 7)
      }
    }

  }

}
