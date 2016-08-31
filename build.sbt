name := "schale"

version := "1.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
