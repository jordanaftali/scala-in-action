organization := "name.heikoseeberger"

name := "scala-in-action"

version := "0.1.0"

scalaVersion := Version.scala

libraryDependencies ++= Dependencies.scalaInAction

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

// initialCommands in console := "import name.heikoseeberger.scalainaction._"
