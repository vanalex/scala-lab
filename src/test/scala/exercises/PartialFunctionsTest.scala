package exercises

import intro.PartialFunctions
import intro.PartialFunctions.doubleEvens
import intro.PartialFunctions.tripleOdds
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PartialFunctionsTest extends AnyFlatSpec with Matchers{

  it should "Partial function example" in {
    val whatToDo = PartialFunctions.doubleEvens orElse tripleOdds //Here we chain the partial functions together

    whatToDo(3) should be(9)
    whatToDo(4) should be(8)
  }

  it should "case partial function" in {
    val doubleEvens: PartialFunction[Int, Int] = {
      case x if (x % 2) == 0 => x * 2
    }
    val tripleOdds: PartialFunction[Int, Int] = {
      case x if (x % 2) != 0 => x * 3
    }

    val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together
    whatToDo(3) should be(9)
    whatToDo(4) should be(8)
  }
}
