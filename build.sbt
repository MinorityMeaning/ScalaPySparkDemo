ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPySparkDemo"
  )

libraryDependencies ++= Seq(
  "ru.mardaunt"        %% "pysparkwrapper" % "0.1.0",
  "org.apache.spark"   %% "spark-sql"      % "3.3.2"
)