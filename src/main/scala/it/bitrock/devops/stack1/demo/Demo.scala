package it.bitrock.devops.stack1

object Demo extends App {

  println("Hello World from Franco!")
  var dockerRegistry = sys.env.getOrElse("dockerRegistry")

}