package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SetTest extends AnyFlatSpec with Matchers{

    it should "test set size" in {
      val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
      mySet.size should be(4)
    }

    it should "test sets contain distinct values" in {
      val mySet = Set("Michigan", "Ohio", "Wisconsin", "Michigan")
      mySet.size should be(3)
    }

    it should "test Sets can be added to easily" in {
      val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
      val aNewSet = mySet + "Illinois"

      aNewSet.contains("Illinois") should be(true)
      mySet.contains("Illinois") should be(false)
    }

  it should "test sets may be of mixed type:" in {
    val mySet = Set("Michigan", "Ohio", 12)

    mySet.contains(12) should be(true)
    mySet.contains("MI") should be(false)
  }

  it should "test sets can be checked for member existence:" in {
    val mySet = Set("Michigan", "Ohio", 12)

    mySet(12) should be(true)
    mySet("MI") should be(false)
  }
}
