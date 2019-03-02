package example

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")


  val ages2 = Seq(42, 61, 29, 64)
  println(s"The oldest person is ${ages2.max}")
}