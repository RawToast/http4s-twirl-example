package hygiene.services

import hygiene.domain.Authority
import io.circe.Json
import io.circe.optics.JsonPath._
import monocle.{Optional, Traversal}

object JsonAuthorityParser extends AuthorityParser[Json] {
  override def summariseAuthorites(authData: Json): Seq[Authority] = {
    val authorityTraversal: Traversal[Json, Json] = root.authorities.each.json

    val authName: Optional[Json, String] = root.Name.string
    val authId: Optional[Json, Int] = root.LocalAuthorityId.int
    val establishmentCount: Optional[Json, Int] = root.EstablishmentCount.int

    authorityTraversal
      .getAll(authData)
      .flatMap(j =>
        for {
          name <- authName.getOption(j)
          id <- authId.getOption(j)
          count <- establishmentCount.getOption(j)
        } yield Authority(name, id, count))
  }
}


trait AuthorityParser[T] {
  def summariseAuthorites(authData: T): Seq[Authority]
}
