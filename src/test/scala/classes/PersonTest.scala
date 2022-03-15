package classes

import basicoop.TermUtil
import basicoop.TermUtil.isIdentityFun
import model.{App, Fun, Person, Var}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonTest extends AnyFlatSpec with Matchers{

  it should "test Case classes have an automatic equals method that works" in {
    val fred = new Person("Fred", "Jones")
    val shaggy = new Person("Shaggy", "Rogers")
    val fred2 = new Person("Fred", "Jones")
    (fred == shaggy) should be (false)
    (fred == fred2) should be (true)
    (fred eq shaggy) should be(false)
    (fred eq fred2) should be(false)
  }

  it should "test Case classes have an automatic hashcode method that works" in {
    val fred = new Person("Fred", "Jones")
    val shaggy = new Person("Shaggy", "Rogers")
    val fred2 = new Person("Fred", "Jones")

    (fred.hashCode == shaggy.hashCode) should be(false)
    (fred.hashCode == fred2.hashCode) should be(true)
  }
}
