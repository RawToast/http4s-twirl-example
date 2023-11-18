package hygiene

import io.circe.Json
import io.circe.literal._

object Responses {
  val validEstablishmentsJson: Json =
    json"""{
  "establishments": [
    {
      "FHRSID": 22124,
      "LocalAuthorityBusinessID": "07/00126/FH",
      "BusinessName": "A Pigs Tale",
      "BusinessType": "Retailers - other",
      "BusinessTypeID": 4613,
      "AddressLine1": "Lane Head Farm Belper Road Alderwasley Belper Derbyshire",
      "AddressLine2": "",
      "AddressLine3": "",
      "AddressLine4": "",
      "PostCode": "DE56 2RF",
      "Phone": "",
      "RatingValue": "5",
      "RatingKey": "fhrs_5_en-gb",
      "RatingDate": "2016-09-16T00:00:00",
      "LocalAuthorityCode": "062",
      "LocalAuthorityName": "Amber Valley",
      "LocalAuthorityWebSite": "http://www.ambervalley.gov.uk",
      "LocalAuthorityEmailAddress": "envhealth@ambervalley.gov.uk",
      "scores": {
        "Hygiene": 5,
        "Structural": 0,
        "ConfidenceInManagement": 0
      },
      "SchemeType": "FHRS",
      "geocode": {
        "longitude": "-1.543746",
        "latitude": "53.076953"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 811509,
      "LocalAuthorityBusinessID": "0000066/FH",
      "BusinessName": "A Taste Of Germany",
      "BusinessType": "Mobile caterer",
      "BusinessTypeID": 7846,
      "AddressLine1": "Hollands Fairground Rides Unit 1 Hall Road Langley Mill Derbyshire",
      "AddressLine2": "",
      "AddressLine3": "",
      "AddressLine4": "",
      "PostCode": "NG16 4HP",
      "Phone": "",
      "RatingValue": "5",
      "RatingKey": "fhrs_5_en-gb",
      "RatingDate": "2016-11-11T00:00:00",
      "LocalAuthorityCode": "062",
      "LocalAuthorityName": "Amber Valley",
      "LocalAuthorityWebSite": "http://www.ambervalley.gov.uk",
      "LocalAuthorityEmailAddress": "envhealth@ambervalley.gov.uk",
      "scores": {
        "Hygiene": 0,
        "Structural": 0,
        "ConfidenceInManagement": 0
      },
      "SchemeType": "FHRS",
      "geocode": {
        "longitude": "-1.329772",
        "latitude": "53.025521"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 747485,
      "LocalAuthorityBusinessID": "0000077/FOOD",
      "BusinessName": "A.Fools Cakes",
      "BusinessType": "Other catering premises",
      "BusinessTypeID": 7841,
      "AddressLine1": "",
      "AddressLine2": "",
      "AddressLine3": "",
      "AddressLine4": "",
      "PostCode": "DE75",
      "Phone": "",
      "RatingValue": "Exempt",
      "RatingKey": "fhrs_5_en-gb",
      "RatingDate": "2015-02-26T00:00:00",
      "LocalAuthorityCode": "062",
      "LocalAuthorityName": "Amber Valley",
      "LocalAuthorityWebSite": "http://www.ambervalley.gov.uk",
      "LocalAuthorityEmailAddress": "envhealth@ambervalley.gov.uk",
      "scores": {
        "Hygiene": 5,
        "Structural": 5,
        "ConfidenceInManagement": 5
      },
      "SchemeType": "FHRS",
      "geocode": {
        "longitude": null,
        "latitude": null
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    }
  ],
  "meta": {
    "dataSource": "Lucene",
    "extractDate": "0001-01-01T00:00:00",
    "itemCount": 0,
    "returncode": "OK",
    "totalCount": 967,
    "totalPages": 323,
    "pageSize": 3,
    "pageNumber": 1
  },
  "links": []
}"""

  val scottishEstablishmentsJson: Json =
    json"""{
  "establishments": [
    {
      "FHRSID": 906411,
      "LocalAuthorityBusinessID": "EHDC11985",
      "BusinessName": "14FORTY @ STATOIL",
      "BusinessType": "Restaurant/Cafe/Canteen",
      "BusinessTypeID": 1,
      "AddressLine1": "",
      "AddressLine2": "Prime Four Business Park",
      "AddressLine3": "Kingswells",
      "AddressLine4": "Aberdeen",
      "PostCode": "AB15 8PJ",
      "Phone": "",
      "RatingValue": "Pass",
      "RatingKey": "fhis_pass_en-gb",
      "RatingDate": "2016-06-30T00:00:00",
      "LocalAuthorityCode": "760",
      "LocalAuthorityName": "Aberdeen City",
      "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
      "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
      "scores": {
        "Hygiene": null,
        "Structural": null,
        "ConfidenceInManagement": null
      },
      "SchemeType": "FHIS",
      "geocode": {
        "longitude": "-2.229412",
        "latitude": "57.148309"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 593681,
      "LocalAuthorityBusinessID": "EHDC9793",
      "BusinessName": "210 BISTRO",
      "BusinessType": "Restaurant/Cafe/Canteen",
      "BusinessTypeID": 1,
      "AddressLine1": "",
      "AddressLine2": "210 Market Street",
      "AddressLine3": "Aberdeen",
      "AddressLine4": "",
      "PostCode": "AB11 5PQ",
      "Phone": "",
      "RatingValue": "Awaiting Inspection",
      "RatingKey": "fhis_awaiting_inspection_en-gb",
      "RatingDate": "2015-10-12T00:00:00",
      "LocalAuthorityCode": "760",
      "LocalAuthorityName": "Aberdeen City",
      "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
      "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
      "scores": {
        "Hygiene": null,
        "Structural": null,
        "ConfidenceInManagement": null
      },
      "SchemeType": "FHIS",
      "geocode": {
        "longitude": "-2.092258",
        "latitude": "57.142278"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 593037,
      "LocalAuthorityBusinessID": "EHDC4774",
      "BusinessName": "22 CLUB",
      "BusinessType": "Pub/bar/nightclub",
      "BusinessTypeID": 7843,
      "AddressLine1": "",
      "AddressLine2": "55 Rose Street",
      "AddressLine3": "Aberdeen",
      "AddressLine4": "",
      "PostCode": "AB10 1UB",
      "Phone": "",
      "RatingValue": "Improvement Required",
      "RatingKey": "fhis_improvement_required_en-gb",
      "RatingDate": "2014-03-11T00:00:00",
      "LocalAuthorityCode": "760",
      "LocalAuthorityName": "Aberdeen City",
      "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
      "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
      "scores": {
        "Hygiene": null,
        "Structural": null,
        "ConfidenceInManagement": null
      },
      "SchemeType": "FHIS",
      "geocode": {
        "longitude": "-2.111912",
        "latitude": "57.144562"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 593038,
      "LocalAuthorityBusinessID": "EHDC4775",
      "BusinessName": "22 CLUB",
      "BusinessType": "Pub/bar/nightclub",
      "BusinessTypeID": 7843,
      "AddressLine1": "",
      "AddressLine2": "55 Rose Street",
      "AddressLine3": "Aberdeen",
      "AddressLine4": "",
      "PostCode": "AB10 1UB",
      "Phone": "",
      "RatingValue": "Awaiting Publication",
      "RatingKey": "fhis_awaiting_publication_en-gb",
      "RatingDate": "2014-03-11T00:00:00",
      "LocalAuthorityCode": "760",
      "LocalAuthorityName": "Aberdeen City",
      "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
      "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
      "scores": {
        "Hygiene": null,
        "Structural": null,
        "ConfidenceInManagement": null
      },
      "SchemeType": "FHIS",
      "geocode": {
        "longitude": "-2.111912",
        "latitude": "57.144562"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    },
    {
      "FHRSID": 593689,
      "LocalAuthorityBusinessID": "EHDC9793",
      "BusinessName": "210 BISTRO",
      "BusinessType": "Restaurant/Cafe/Canteen",
      "BusinessTypeID": 1,
      "AddressLine1": "",
      "AddressLine2": "210 Market Street",
      "AddressLine3": "Aberdeen",
      "AddressLine4": "",
      "PostCode": "AB11 5PQ",
      "Phone": "",
      "RatingValue": "Exempt",
      "RatingKey": "fhis_exempt_en-gb",
      "RatingDate": "2015-10-12T00:00:00",
      "LocalAuthorityCode": "760",
      "LocalAuthorityName": "Aberdeen City",
      "LocalAuthorityWebSite": "http://www.aberdeencity.gov.uk",
      "LocalAuthorityEmailAddress": "commercial@aberdeencity.gov.uk",
      "scores": {
        "Hygiene": null,
        "Structural": null,
        "ConfidenceInManagement": null
      },
      "SchemeType": "FHIS",
      "geocode": {
        "longitude": "-2.092258",
        "latitude": "57.142278"
      },
      "RightToReply": "",
      "Distance": null,
      "NewRatingPending": false,
      "meta": {
        "dataSource": null,
        "extractDate": "0001-01-01T00:00:00",
        "itemCount": 0,
        "returncode": null,
        "totalCount": 0,
        "totalPages": 0,
        "pageSize": 0,
        "pageNumber": 0
      },
      "links": []
    }
  ],
  "meta": {
    "dataSource": "Lucene",
    "extractDate": "0001-01-01T00:00:00",
    "itemCount": 0,
    "returncode": "OK",
    "totalCount": 1761,
    "totalPages": 587,
    "pageSize": 4,
    "pageNumber": 1
  },
  "links": []
}"""

  val multiAuthorityResponse =
    json"""{
  "authorities": [
    {
      "LocalAuthorityId": 197,
      "LocalAuthorityIdCode": "760",
      "Name": "Aberdeen City",
      "EstablishmentCount": 1761,
      "SchemeType": 2,
      "links": [
        {
          "rel": "self",
          "href": "http://api.ratings.food.gov.uk/authorities/197"
        }
      ]
    },
    {
      "LocalAuthorityId": 198,
      "LocalAuthorityIdCode": "761",
      "Name": "Aberdeenshire",
      "EstablishmentCount": 1794,
      "SchemeType": 2,
      "links": [
        {
          "rel": "self",
          "href": "http://api.ratings.food.gov.uk/authorities/198"
        }
      ]
    },
    {
      "LocalAuthorityId": 277,
      "LocalAuthorityIdCode": "323",
      "Name": "Adur",
      "EstablishmentCount": 407,
      "SchemeType": 1,
      "links": [
        {
          "rel": "self",
          "href": "http://api.ratings.food.gov.uk/authorities/277"
        }
      ]
    },
    {
      "LocalAuthorityId": 158,
      "LocalAuthorityIdCode": "055",
      "Name": "Allerdale",
      "EstablishmentCount": 1068,
      "SchemeType": 1,
      "links": [
        {
          "rel": "self",
          "href": "http://api.ratings.food.gov.uk/authorities/158"
        }
      ]
    },
    {
      "LocalAuthorityId": 48,
      "LocalAuthorityIdCode": "062",
      "Name": "Amber Valley",
      "EstablishmentCount": 967,
      "SchemeType": 1,
      "links": [
        {
          "rel": "self",
          "href": "http://api.ratings.food.gov.uk/authorities/48"
        }
      ]
    }]}"""

}
