package intro

import model.{Draw, Exit, Message, Response}

object PartialFunctions {

  val squareRoot = new PartialFunction[Double, Double] {
    def apply(x: Double) = Math.sqrt(x)
    def isDefinedAt(x: Double) = x >= 0
  }

  val func: Message => String = {
    case Exit(str) => "Got Exit"
    case Draw(shape) => s"Got Draw($shape)"
    case Response(str) => s"Got Response($str)"
  }

  val pfunc: PartialFunction[Message, String] = {
    case Exit(str) => "Got Exit"
    case Draw(shape) => s"Got Draw($shape)"
    case Response(str) => s"Got Response($str)"
  }

  val doubleEvens: PartialFunction[Int, Int] =
    new PartialFunction[Int, Int] {
      //States that this partial function will take on the task
      def isDefinedAt(x: Int) = x % 2 == 0

      //What we do if this partial function matches
      def apply(v1: Int) = v1 * 2
    }

  val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x: Int) = x % 2 != 0

    def apply(v1: Int) = v1 * 3
  }
}
