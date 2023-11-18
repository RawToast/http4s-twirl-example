package hygiene.domain

import io.circe.Codec
import io.circe.generic.semiauto.deriveCodec

case class Authority(name: String, id: Int, establishments: Int)

object Authority:
  given Codec[Authority] = deriveCodec

enum AuthorityRating:
  case Standard(five: Int, four: Int, three: Int, two: Int, one: Int, zero: Int, exempt: Int)
  case Scottish(pass: Int, improvementRequired: Int, exempt: Int)
  case Exempt(count: Int)

object AuthorityRating:
  given Codec[AuthorityRating] = deriveCodec
