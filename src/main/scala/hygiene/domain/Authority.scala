package hygiene.domain

import io.circe.Codec
import io.circe.generic.semiauto.deriveCodec

case class Authority(name: String, id: Int, establishments: Int)

object Authority:
  given Codec[Authority] = deriveCodec

enum EstablishmentRatings:
  case Standard(five: Int, four: Int, three: Int, two: Int, one: Int, zero: Int, exempt: Int)
  case Scottish(pass: Int, improvementRequired: Int, exempt: Int)

object EstablishmentRatings:
  given Codec[EstablishmentRatings] = deriveCodec

enum RatingSummary:
  case Standard(
    five: String,
    four: String,
    three: String,
    two: String,
    one: String,
    zero: String,
    exempt: String
  )
  case Scottish(pass: String, improvementRequired: String, exempt: String)

object RatingSummary:
  given Codec[RatingSummary] = deriveCodec

case class AuthoritySummary(name: String, ratings: RatingSummary)

object AuthoritySummary:
  given Codec[AuthoritySummary] = deriveCodec
