package standard

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

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
}
