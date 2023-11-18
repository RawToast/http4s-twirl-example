package hygiene.services.util

// import hygiene.Responses.{scottishEstablishmentsJson, validEstablishmentsJson}
// import org.scalatest.WordSpec

object EstablishmentParserSpec
// class EstablishmentParserSpec extends WordSpec {

//   "EstablishmentParser" when {

//     "parsing an establishment " must {

//       "return the score of the establishment" in {
//         val score: Option[String] = JsonEstablishmentParser.establishmentRating(singleEstablishmentJson)
//         val expectedScore = "5"
//         assert(score.contains(expectedScore))
//       }

//       "return the score of the a scottish establishment" in {
//         val score = JsonEstablishmentParser.establishmentRating(singleScottishEstablishmentJson)
//         assert(score.nonEmpty)
//         assert(score.contains("Pass"))
//       }

//     }

//     "summarising establishment scores" must {

//       "return the summary" in {

//         val scores: Map[String, Int] = JsonEstablishmentParser.countEstablishmentRatings(validEstablishmentsJson)
//         val expectedScore = Map("5" -> 2, "Exempt" -> 1)

//         assert(scores.nonEmpty)
//         assert(scores == expectedScore)
//       }

//       "return a summary for scottish scores" in {
//         val scores: Map[String, Int] = JsonEstablishmentParser.countEstablishmentRatings(scottishEstablishmentsJson)

//         assert(scores.nonEmpty)
//         assert(scores.size == 5)
//         assert(scores == Map("Awaiting Publication" -> 1, "Improvement Required" -> 1,
//           "Exempt" -> 1, "Awaiting Inspection" -> 1, "Pass" -> 1))
//       }

//       "return an empty summary for JSON with a different structure" in {
//         val scores: Map[String, Int] = JsonEstablishmentParser.countEstablishmentRatings(jsonWithDifferentStructure)

//         assert(scores.isEmpty)
//       }

//     }

//   }

//   import io.circe.literal._

//   val singleEstablishmentJson =
//     json"""{
//       "FHRSID": 22124,
//       "LocalAuthorityBusinessID": "07/00126/FH",
//       "BusinessName": "A Pigs Tale",
//       "BusinessType": "Retailers - other",
//       "BusinessTypeID": 4613,
//       "AddressLine1": "Lane Head Farm Belper Road Alderwasley Belper Derbyshire",
//       "AddressLine2": "",
//       "AddressLine3": "",
//       "AddressLine4": "",
//       "PostCode": "DE56 2RF",
//       "Phone": "",
//       "RatingValue": "5",
//       "RatingKey": "fhrs_5_en-gb",
//       "RatingDate": "2016-09-16T00:00:00",
//       "LocalAuthorityCode": "062",
//       "LocalAuthorityName": "Amber Valley",
//       "LocalAuthorityWebSite": "http://www.ambervalley.gov.uk",
//       "LocalAuthorityEmailAddress": "envhealth@ambervalley.gov.uk",
//       "scores": {
//         "Hygiene": 5,
//         "Structural": 0,
//         "ConfidenceInManagement": 0
//       },
//       "SchemeType": "FHRS",
//       "geocode": {
//         "longitude": "-1.543746",
//         "latitude": "53.076953"
//       },
//       "RightToReply": "",
//       "Distance": null,
//       "NewRatingPending": false,
//       "meta": {
//         "dataSource": null,
//         "extractDate": "0001-01-01T00:00:00",
//         "itemCount": 0,
//         "returncode": null,
//         "totalCount": 0,
//         "totalPages": 0,
//         "pageSize": 0,
//         "pageNumber": 0
//       },
//       "links": []
//     }"""

//   val singleScottishEstablishmentJson =
//     json"""{
//       "FHRSID": 906411,
//       "LocalAuthorityBusinessID": "EHDC11985",
//       "BusinessName": "14FORTY @ STATOIL",
//       "BusinessType": "Restaurant/Cafe/Canteen",
//       "BusinessTypeID": 1,
//       "AddressLine1": "",
//       "AddressLine2": "Prime Four Business Park",
//       "AddressLine3": "Kingswells",
//       "AddressLine4": "Aberdeen",
//       "PostCode": "AB15 8PJ",
//       "Phone": "",
//       "RatingValue": "Pass",
//       "RatingKey": "fhis_pass_en-gb",
//       "RatingDate": "2016-06-30T00:00:00",
//       "LocalAuthorityCode": "760",
//       "LocalAuthorityName": "Aberdeen City",
//       "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
//       "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
//       "scores": {
//         "Hygiene": null,
//         "Structural": null,
//         "ConfidenceInManagement": null
//       },
//       "SchemeType": "FHIS",
//       "geocode": {
//         "longitude": "-2.229412",
//         "latitude": "57.148309"
//       },
//       "RightToReply": "",
//       "Distance": null,
//       "NewRatingPending": false,
//       "meta": {
//         "dataSource": null,
//         "extractDate": "0001-01-01T00:00:00",
//         "itemCount": 0,
//         "returncode": null,
//         "totalCount": 0,
//         "totalPages": 0,
//         "pageSize": 0,
//         "pageNumber": 0
//       },
//       "links": []
//     }"""

//   val jsonWithDifferentStructure = json"""{"message": "hello"}"""
// }
