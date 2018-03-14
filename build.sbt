lazy val cinnamonPrometheusSample = project
  .in(file("."))
  .enablePlugins(Cinnamon, JavaAppPackaging)
  .settings(
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.11",
      Cinnamon.library.cinnamonAkka,
      Cinnamon.library.cinnamonPrometheusHttpServer
    )
  )
