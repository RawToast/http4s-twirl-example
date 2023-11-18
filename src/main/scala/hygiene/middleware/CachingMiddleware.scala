package hygiene.middleware

// import fs2.Task
// import org.http4s.Method.GET
// import org.http4s._
// import org.log4s._
// import org.http4s.dsl._

object CachingMiddleware

//   lazy val logger = getLogger

//   var authCache = Option.empty[(MaybeResponse, Long)]
//   var estCache = Map.empty[Int, (MaybeResponse, Long)]

//   def cacheRoot(service: HttpService, ttlSeconds: Long = 30L): HttpService = Service.lift((req: Request) => {

//     lazy val gg = req match {
//       case GET -> Root =>
//         authCache.map(o => Task.delay(o._1))
//           .getOrElse(service(req))
//           .map{mr => updateCache(mr)
//             mr
//           }
//       case _ => service(req)
//     }

//     def time = System.currentTimeMillis()

//     def updateCache(maybeResponse: MaybeResponse): Unit = {
//       if (authCache.isEmpty) {
//         logger.info("Populating initial cache")
//         authCache = Some(maybeResponse, time)
//       }
//       else {
//         val (_, created) = authCache.get
//         if (created + (ttlSeconds * 1000) < time) {
//           logger.info("Updating old cache")

//           authCache = Some(maybeResponse -> time)
//         }

//       }
//     }

//     gg
//   }
//   )
// }
