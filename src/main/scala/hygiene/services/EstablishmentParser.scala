package hygiene.services

import io.circe.Json

trait EstablishmentParser[T] {
  def establishmentRating(singleEstablishment: T): Option[String]

  def countEstablishmentRatings(validEstablishmentsJson: T): Map[String, Int]
}

object JsonEstablishmentParser extends EstablishmentParser[Json] {

  //private val emptyRatings = Map((5, 0), (4, 0), (3, 0), (2, 0), (1, 0), (0, 0))

  import io.circe.optics.JsonPath._

  def establishmentRating(singleEstablishment: Json): Option[String] =
    root.RatingValue.string.getOption(singleEstablishment)

  def countEstablishmentRatings(validEstablishments: Json): Map[String, Int] = {
    import cats.implicits._

    val scores: Seq[String] = root.establishments.each.RatingValue.string.getAll(validEstablishments)

    scores
      .foldLeft(Map.empty[String, Int])((s: Map[String, Int], i: String) =>
      s |+| Map(i -> 1)
    )
  }
}


