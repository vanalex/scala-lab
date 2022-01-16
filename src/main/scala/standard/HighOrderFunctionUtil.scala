package standard

object HighOrderFunctionUtil {

  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }

  def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5)

  def makeUpper(xs: List[String]) = xs map {
      _.toUpperCase
    }

  def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) = xs map sideEffect
}
