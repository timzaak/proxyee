import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "1.0"
ThisBuild / organization := "com.strategytechnology"
ThisBuild / organizationName := "Strategy&Technology"


lazy val proxyee = (project in file("."))
  .settings(
    name := "proxyee",
    libraryDependencies ++=
      Seq(bcpkix)
        ++ nettyDependencies

  )
