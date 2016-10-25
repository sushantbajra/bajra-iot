name := """iot-portal"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( javaJdbc ,  cache , javaWs,
  "com.amazonaws" % "aws-java-sdk-core" % "1.11.43",
  "com.amazonaws" % "aws-java-sdk-iot" % "1.11.43"
)
