
name := "food-hygiene"

version := "1.0"

scalaVersion := "2.12.10"

val http4sVersion = "0.17.6"
val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "org.http4s" %% "http4s-twirl" % http4sVersion,


  // Circe for handling JSON
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-literal" % circeVersion,
  "io.circe" %% "circe-optics" % circeVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.1",

  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",

  // Test
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.mockito" % "mockito-core" % "2.7.21" % "test",
  "com.github.tomakehurst" % "wiremock" % "2.12.0" % "test"
)

// Packaging
enablePlugins(JavaAppPackaging)

// HTML Templates
enablePlugins(SbtTwirl)

// Code coverage alias
addCommandAlias("validate", ";coverage;test;coverageReport")

coverageMinimum := 75
coverageFailOnMinimum := true


val compilerOptions = Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:_",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xfuture",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused"
)
val additionalOptions = Seq(
  "-Ywarn-dead-code",
  "-Ywarn-value-discard"
)

Compile / doc / scalacOptions ++= compilerOptions ++ additionalOptions

Test / scalacOptions  ++= compilerOptions
