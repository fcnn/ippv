val scala3Version = "3.2.2-RC1-bin-20221028-5bd67bb-NIGHTLY"
//val scala3Version = "3.2.0"

//val playJson  = "com.typesafe.play" %% "play-json" % "2.9.2"

lazy val root = project
  .in(file("."))
  //.enablePlugins(JavaAppPackaging)
  .settings(
    name := "IPPV",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0-M6" % Test,
      "com.google.flatbuffers" % "flatbuffers-java" % "2.0.3"
    )
  )
