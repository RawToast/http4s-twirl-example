package hygiene.services.util

trait RatingsFormatter:
  def summariseRatings(ratings: Map[String, Int]): Map[String, Double]

// object UniversalRatingsFormatter extends RatingsFormatter {
//   /**
//     * Note that this implementation of Formatter can handle scottish or star based ratings
//     */
//   def summariseRatings(ratings: Map[String, Int]): Map[String, Double] = {
//     import cats.implicits._

//     if (ratings.isEmpty) Map.empty
//     else if (ratings.keySet == Set(exempt)) toPercent(ratings)
//     else if (ratings.keySet.exists(key => scottishRatings.contains(key))) scottishSummary |+| toPercent(ratings)
//     else {
//       // Calculate percentage and add `-star` prefix if required.
//       val mySum = toPercent(ratings)
//         .map{ case (key: String, value: Double) =>
//           if (key.length == 1) (s"$key-star", value) else key -> value}

//       // Combination ensures we include any missing rating categories
//       summary |+| mySum
//     }
//   }

//   private def toPercent(ratings: Map[String, Int]): Map[String, Double] =
//     ratings.mapValues(v => (v.toDouble / ratings.values.sum) * 100)

//   private val exempt = "Exempt"
//   private val summary = Map[String, Double]("5-star" -> 0, "4-star" -> 0,
//     "3-star" -> 0, "2-star" -> 0, "1-star" -> 0, "0-star" -> 0, exempt -> 0)

//   private val scottishSummary = Map[String, Double]("Pass" -> 0, "Improvement Required" -> 0, exempt -> 0)
//   private val scottishRatings = scottishSummary.keySet - exempt + "Awaiting Publication" + "Awaiting Inspection"
// }
