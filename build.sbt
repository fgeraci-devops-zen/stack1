

name := "scalapoc"

version := "1.0"

scalaVersion := "2.12.4"

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

packageName in Docker := "scalapoc"
version     in Docker := version.value

lazy val root = project.in(file("."))

// No need to run tests while building jar
test in assembly := {}
// Simple and constant jar name
assemblyJarName in assembly := s"stack1-demo001.jar"
// Merge strategy for assembling conflicts
assemblyMergeStrategy in assembly := {
  case PathList("reference.conf") => MergeStrategy.concat
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case _ => MergeStrategy.first
}