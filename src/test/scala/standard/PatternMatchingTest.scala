package standard

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PatternMatchingTest extends AnyFlatSpec with Matchers{

  it should "test set size" in {
    var result = PatternMatchingUtil.matchTest(3);
    result should be("many")
  }
}
