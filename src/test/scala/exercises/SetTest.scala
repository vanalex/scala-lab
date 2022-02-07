package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SetTest extends AnyFlatSpec with Matchers{

    it should "test set size" in {
      val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
      mySet.size should be(4)
    }
}
