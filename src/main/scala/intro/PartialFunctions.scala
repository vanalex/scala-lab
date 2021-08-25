package intro

object PartialFunctions {

  val squareRoot = new PartialFunction[Double, Double] {
    def apply(x: Double) = Math.sqrt(x)
    def isDefinedAt(x: Double) = x >= 0
  }
}
