//val scala3Version = "3.1.2"
val scala3Version = "3.2.0-RC1-bin-20220419-ef16034-NIGHTLY"

//val playJson  = "com.typesafe.play" %% "play-json" % "2.9.2"

lazy val root = project
  .in(file("."))
  //.enablePlugins(JavaAppPackaging)
  .settings(
    name := "IPPV",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )