# Http4s Twirl Example

![ci](https://github.com/rawtoast/http4s-twirl-example/actions/workflows/ci.yml/badge.svg)

This application is an example of using Http4s, Blaze Client, Circe and Twirl templates -- including example unit and template tests.

## Running this app

To start: `sbt run` this will run the service on port 8080


## Running tests

An alias has been provided to run all tests with coverage: `sbt validate` the html report can be located
at `target/scala-2.12/scoverage-report/index.html`


## Tech Stack

This api is built on the following Scala / Java open source libraries:

* [Http4s](http://http4s.org)
* [Circe](https://circe.github.io/circe)
* [Cats](http://typelevel.org/cats)
* [Twirl](https://github.com/playframework/twirl)
* [ScalaTest](http://www.scalatest.org)
* [Mockito](http://site.mockito.org)
* [WireMock](http://wiremock.org)
