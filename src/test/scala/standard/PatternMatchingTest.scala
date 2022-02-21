package standard

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PatternMatchingTest extends AnyFlatSpec with Matchers{

  it should "test simple pattern mathcing" in {
    var result = PatternMatchingUtil.matchTest(3);
    result should be("many")
  }

  it should "test other simple pattern matching" in {
    val stuff = "blue"

    val myStuff = stuff match {
      case "red" =>
        println("RED"); 1
      case "blue" =>
        println("BLUE"); 2
      case "green" =>
        println("GREEN"); 3
      case _ =>
        println(stuff); 0 // case _ will trigger if all other cases fail.
    }

    myStuff should be(2)
  }
}
