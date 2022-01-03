val scala3Version = "3.0.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-lab",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test",
      libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test,
    libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "0.7.26" % Test,
  )
