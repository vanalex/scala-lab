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

  it should "test Pattern matching can substitute parts of expressions" in {
    def goldilocks(expr: (String, String)) =
      expr match {
        case ("porridge", bear) =>
          bear + " said someone's been eating my porridge"
        case ("chair", bear) => bear + " said someone's been sitting in my chair"
        case ("bed", bear) => bear + " said someone's been sleeping in my bed"
        case _ => "what?"
      }

    goldilocks(("porridge", "Papa")) should be("Papa said someone's been eating my porridge")
    goldilocks(("chair", "Mama")) should be("Mama said someone's been sitting in my chair")
  }

  it should "test A backquote can be used to refer to a stable variable in scope to create a case statement - this prevents \"variable shadowing\"" in {
    val foodItem = "porridge"

    def goldilocks(expr: (String, String)) =
      expr match {
        case (`foodItem`, _) => "eating"
        case ("chair", "Mama") => "sitting"
        case ("bed", "Baby") => "sleeping"
        case _ => "what?"
      }

    goldilocks(("porridge", "Papa")) should be("eating")
    goldilocks(("chair", "Mama")) should be("sitting")
    goldilocks(("porridge", "Cousin")) should be("eating")
    goldilocks(("beer", "Cousin")) should be("what?")
  }

  it should "test A backquote can be used to refer to a method parameter as a stable variable to create a case statement:" in {
    def patternEquals(i: Int, j: Int) =
      j match {
        case `i` => true
        case _ => false
      }
    patternEquals(3, 3) should be(true)
    patternEquals(7, 9) should be(false)
    patternEquals(9, 9) should be(true)
  }

  it should "test To pattern match against a List, the list can be split into parts, in this case the head x and the tail xs. Since the case doesn't terminate in Nil, xs is interpreted as the rest of the list:" in {
    val secondElement = List(1, 2, 3) match {
      case x :: xs => xs.head
      case _ => 0
    }

    secondElement should be(2)
  }
}
