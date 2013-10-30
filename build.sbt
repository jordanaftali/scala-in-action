organization := "name.heikoseeberger"

name := "scala-in-action"

version := "2.0.0"

scalaVersion := Version.scala

libraryDependencies ++= Dependencies.scalaInAction

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)

fork in run := true
