package example

object HelloTest extends Greeting with App {
  println(greeting)
  println(greeting1)
}

trait Greeting {
  lazy val greeting: String = "wo"
  lazy val greeting1: String = "helloTest"
}
