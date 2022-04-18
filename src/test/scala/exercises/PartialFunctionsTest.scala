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
}
