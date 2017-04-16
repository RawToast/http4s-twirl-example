package hygiene.services

trait Formatter {
  def summariseRatings(ratings: Map[String, Int]): Map[String, Double]
}

object RatingsFormatter extends Formatter {
  def summariseRatings(ratings: Map[String, Int]): Map[String, Double] = {
    import cats.implicits._

    if (ratings.isEmpty) Map.empty
    else if (ratings.keySet == Set(exempt)) toPercent(ratings)
    else if (ratings.keySet.exists(key => scottishRatings.contains(key))) scottishSummary |+| toPercent(ratings)
    else {
      val mySum = toPercent(ratings)
        .map(kv => if (kv._1.length == 1) (s"${kv._1}-star", kv._2) else kv)

      summary |+| mySum
    }
  }

  private def toPercent(ratings: Map[String, Int]): Map[String, Double] =
    ratings.mapValues(v => (v.toDouble / ratings.values.sum) * 100)

  private val exempt = "Exempt"
  private val summary = Map[String, Double]("5-star" -> 0, "4-star" -> 0,
    "3-star" -> 0, "2-star" -> 0, "1-star" -> 0, "0-star" -> 0, exempt -> 0)

  private val scottishSummary = Map[String, Double]("Pass" -> 0, "Improvement Required" -> 0, exempt -> 0)
  private val scottishRatings = scottishSummary.keySet - exempt + "Awaiting Publication" + "Awaiting Inspection"
}
