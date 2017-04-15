package hygiene.services

trait Formatter {
  def summariseRatings(ratings: Map[String, Int]): Map[String, Double]
}

object RatingsFormatter extends Formatter {
  def summariseRatings(ratings: Map[String, Int]): Map[String, Double] = {
    if (ratings.isEmpty) Map.empty
    else {
      import cats.implicits._

      val establishments: Int = ratings.values.sum

      val mySum = ratings.mapValues(v => (v.toDouble / establishments) * 100)
        .map(kv => if (kv._1 != "Exempt") (s"${kv._1}-star", kv._2) else kv)

      summary |+| mySum
    }
  }

  private val summary: Map[String, Double] = Map("5-star" -> 0, "4-star" -> 0,
    "3-star" -> 0, "2-star" -> 0, "1-star" -> 0, "0-star" -> 0, "Exempt" -> 0)
}
