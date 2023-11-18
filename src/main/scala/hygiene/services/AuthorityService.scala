// package hygiene.services

// import fs2.Task
// import hygiene.client.JsonClient
// import hygiene.domain.Authority
// import hygiene.services.util.AuthorityParser
// import io.circe.Json
// import org.log4s.{Logger, getLogger}

// trait ListAuthorities {
//   def authorities: Task[Seq[Authority]]
// }

// class AuthorityService(client: JsonClient, authorityParser: AuthorityParser[Json])
//   extends ListAuthorities {

//   lazy val logger: Logger = getLogger

//   def authorities: Task[Seq[Authority]] = {
//       client.fetch("/authorities/basic")
//         .map(authorityParser.summariseAuthorites)
//   }

// }