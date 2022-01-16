package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import standard.HighOrderFunctionUtil.{addWithoutSyntaxSugar, fiveAdder, makeUpper, makeWhatEverYouLike}

class HighOrderFunctionsTest extends AnyFlatSpec with Matchers {

  def lambda = { (x: Int) => x + 1 }
  def lambda2 = (x: Int) => x + 2
  val lambda3 = (x: Int) => x + 3

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
  }

  def lambda5(x: Int) = x + 1

  def lambda6 = (x: Int) => x + 1

  def multiplier = (i: Int) => i * 10

  it should "test simple high order function" in {
    val result = lambda(3)
    val result1andhalf = lambda.apply(5)

    val result2 = lambda2(3)
    val result3 = lambda3(3)
    val result4 = lambda4(3)
    val result5 = lambda5(3)

    result should be(4)
    result1andhalf should be(6)
    result2 should be(5)
    result3 should be(6)
    result4 should be(2)
    result5 should be(4)

    val result6 = lambda6(10)
    result6 should be(11)

    val resultMultiplier = multiplier(10)
    resultMultiplier should be (100)
  }

  it should "test high order function return another high order function" in {
    addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]] should be(true)
    addWithoutSyntaxSugar(2)(3) should be(5)
    fiveAdder(5) should be(10)

    makeUpper(List("abc", "xyz", "123")) should be(List("ABC", "XYZ", "123"))

    makeWhatEverYouLike(List("ABC", "XYZ", "123"), x => x.toLowerCase) should be(List("abc", "xyz", "123"))

    //using it inline
    val myName = (name: String) => s"My name is $name"
    makeWhatEverYouLike(List("John", "Mark"), myName) should be(List("My name is John", "My name is Mark"))

    List("Scala", "Erlang", "Clojure") map (_.length) should be(List(5, 6, 7))
  }

}
