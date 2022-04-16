package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PartiallyFunctionsTest extends AnyFlatSpec with Matchers{

  it should "This partially applied function doesn't apply any arguments" in {
    def sum(a: Int, b: Int, c: Int) = a + b + c
    val sum3 = sum _
    sum3(1, 9, 7) should be(17)
    sum(4, 5, 6) should be(15)
  }

  it should "Partially applied functions can replace any number of arguments" in {
    def sum(a: Int, b: Int, c: Int) = a + b + c
    val sumC = sum(1, 10, _: Int)
    sumC(4) should be(15)
    sum(4, 5, 6) should be(15)
  }
}
