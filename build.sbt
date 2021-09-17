ThisBuild / scalaVersion     := "3.0.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.jlprat.github"
ThisBuild / organizationName := "jlprat"

lazy val root = (project in file("."))
  .settings(
    name := "Overload-Sam-reproducer"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
