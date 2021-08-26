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
}
