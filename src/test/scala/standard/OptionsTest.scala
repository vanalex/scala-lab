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
}
