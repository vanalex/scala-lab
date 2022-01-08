package standard

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import standard.OptionUtil.maybeItWillReturnSomething

class OptionsTest extends AnyFlatSpec with Matchers{

  it should "test Option with some value" in {
    val someValue : Option[String] = Some ("I am wrapped in something")
    val finalValue = someValue.getOrElse(default = "default value")
    finalValue should equal("I am wrapped in something")
  }

  it should "test Option without value" in {
    val noneValue : Option[String] = None
    val finalNoneValue = noneValue.getOrElse(default = "default value")
    finalNoneValue should equal("default value")
  }

  it should "" in {
    val value1 = maybeItWillReturnSomething(true)
    val value2 = maybeItWillReturnSomething(false)

    value1 getOrElse "No value" should be("Found value")
    value2 getOrElse "No value" should be("No value")
    value2 getOrElse {"default function"} should be("default function")
  }

  it should "Option with pattern matching" in {
    val someValue: Option[Double] = Some(20.0)
    val value = someValue match {
      case Some(v) => v
      case None => 0.0
    }

    value should be(20.0)

    val noValue: Option[Double] = None
    val value1 = noValue match {
      case Some(v) => v
      case None => 0.0
    }
    value1 should be(0.0)
  }

  it should "Option with collecton style operations" in {
    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.map(_ * 1.5)
    val result2 = noNumber.map(_ * 1.5)

    result1 should be(Some(4.5))
    result2 should be(None)
  }
}
