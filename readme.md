# Http4s Twirl Example

[![CircleCI](https://circleci.com/gh/RawToast/http4s-twirl-example/tree/master.svg?style=svg&circle-token=90076579eefc7b29b7725fcc0b75ca9445f8aa82)](https://circleci.com/gh/RawToast/http4s-twirl-example/tree/master)

This application is an example of combining Http4s with Twirl templates, including example unit and template tests.


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
