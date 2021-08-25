package intro

object HelloWorld {

  val (s, u) = ("halllo", "bye")

  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println(s, " ", u)
  }
}
