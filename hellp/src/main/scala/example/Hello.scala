package example

object Hello extends Greeting1 with App {
  println(greeting)
  println(greeting1)
}

trait Greeting1 {
  lazy val greeting: String = "wo"
  lazy val greeting1: String = "hello"
}
