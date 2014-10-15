name := "wcs-akka-api"

version := "1.0"

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-deprecation")

// scala-compiler is declared as an optional dependency by Slick.
// You need to add it explicitly to your own project if you want
// to use the direct embedding (as in SimpleExample.scala here).
libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-compiler" % _)