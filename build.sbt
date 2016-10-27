name := "akka-http-101"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {

  val akkaV = "2.4.11"
  val slickVersion = "3.1.1"
  val postgreSqlVersion = "9.4.1211.jre7"
  val hikariCpVersion = "2.5.1"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-http-core" % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV,
    "com.typesafe.slick" %% "slick" % slickVersion,
    "org.postgresql" % "postgresql" % postgreSqlVersion,
    "com.zaxxer" % "HikariCP" % hikariCpVersion
  )
}