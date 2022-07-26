val scala3Version = "3.2.1-RC1-bin-20220723-1b299b3-NIGHTLY"
//val scala3Version = "3.1.3"

//val playJson  = "com.typesafe.play" %% "play-json" % "2.9.2"

lazy val root = project
  .in(file("."))
  //.enablePlugins(JavaAppPackaging)
  .settings(
    name := "IPPV",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "com.google.flatbuffers" % "flatbuffers-java" % "2.0.3"
    )
  )
