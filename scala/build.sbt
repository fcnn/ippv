//val scala3Version = "3.1.2"
val scala3Version = "3.2.0-RC1-bin-20220521-0181ef9-NIGHTLY"

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
