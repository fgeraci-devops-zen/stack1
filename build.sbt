

name := "scalapoc"

version := "1.0"

scalaVersion := "2.12.4"

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

packageName in Docker := "scalapoc"
version     in Docker := version.value

lazy val root = project.in(file("."))