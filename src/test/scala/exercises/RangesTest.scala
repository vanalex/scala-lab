package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RangesTest extends AnyFlatSpec with Matchers{

  it should "test Case classes have an automatic equals method that works" in {
    val someNumbers = Range(0, 10)
    val second = someNumbers(1)
    val last = someNumbers.last

    someNumbers.size should be(10)
    second should be(1)
    last should be(9)
  }

  it should "Ranges can be specified using 'until'" in {
    val someNumbers = Range(0, 10)
    val otherRange = 0 until 10

    (someNumbers == otherRange) should be(true)
  }

  it should "Range can specify a step for an increment" in {
    val someNumbers = Range(2, 10, 3)
    val second = someNumbers(1)
    val last = someNumbers.last

    someNumbers.size should be(3)
    second should be(5)
    last should be(8)
  }
}
