package hygiene.client

import fs2.Task
import io.circe.Json
import org.http4s.Status.Successful
import org.http4s._
import org.http4s.circe._
import org.http4s.client.Client
import org.http4s.dsl._
import org.log4s._


class JsonClient(client: Client) extends HygieneClient[Json] {

  lazy val logger: Logger = getLogger

  def fetch(uri: Uri): Task[Json] = {

    client.fetch[Json](Request(GET, uri, headers = Headers(Header("x-api-version", "2")))) { (r: Response) =>
      r.status.responseClass match {
        case Successful =>
          logger.info(s"Call to uri=$uri returned successfully")
          r.as[Json]
        case _ => logger.warn(s"Call to uri=$uri did not return a successful response code=${r.status.code}")
          r.as[Json]
      }
    }
  }
}

trait HygieneClient[T] {
  def fetch(uri: Uri): Task[T]
}
