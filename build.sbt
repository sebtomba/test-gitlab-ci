
val additionalScalacOptions = Seq(
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-infer-any",
  "-Ywarn-unused-import",
  "-Ypartial-unification",
//  "-Xfatal-warnings",
  "-Xlint"
)

val projectSettings = Seq(
  name := "",
  description := "",
  version := "1.0",
  scalaVersion := "2.12.6",
  organization := "Sebastian Bach",
  scalacOptions ++= additionalScalacOptions
)

val dependencies = Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val root = (project in file("."))
  .settings(projectSettings: _*)
  .settings(libraryDependencies ++= dependencies)
