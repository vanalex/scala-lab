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

  it should "test pattern matching can return multiple values" in {
    val stuff = "blue"

    val myStuff = stuff match {
      case "red" => (255, 0, 0)
      case "green" => (0, 255, 0)
      case "blue" => (0, 0, 255)
      case _ => println(stuff); 0
    }

    myStuff should be((0, 0, 255))
  }

  it should "test pattern matching can match complex values" in {
    def goldilocks(expr: Any) =
      expr match {
        case ("porridge", "Papa") => "Papa eating porridge"
        case ("porridge", "Mama") => "Mama eating porridge"
        case ("porridge", "Baby") => "Baby eating porridge"
        case _ => "what?"
      }

    goldilocks(("porridge", "Mama")) should be("Mama eating porridge")
  }

  it should "test pattern matching can wildcard parts of expressions" in {
    def goldilocks(expr: Any) =
      expr match {
        case ("porridge", _) => "eating"
        case ("chair", "Mama") => "sitting"
        case ("bed", "Baby") => "sleeping"
        case _ => "what?"
      }

    goldilocks(("porridge", "Papa")) should be("eating")
    goldilocks(("chair", "Mama")) should be("sitting")
  }
}
