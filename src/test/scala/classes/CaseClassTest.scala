package classes

import basicoop.TermUtil
import basicoop.TermUtil.isIdentityFun
import model.{App, Dog, Fun, Person, Var}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CaseClassTest extends AnyFlatSpec with Matchers{

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

  it should "test Case classes can be created in a convenient way" in {
    val d1 = Dog("Scooby", "Doberman")
    val d2 = Dog("Rex", "Custom")
    val d3 = new Dog("Scooby", "Doberman") // the old way of creating using new

    (d1 == d3) should be(true)
    (d1 == d2) should be(false)
    (d2 == d3) should be(false)
  }

  it should "test Case classes have a convenient toString method defined" in {
    val d1 = Dog("Scooby", "Doberman")

    d1.toString should be("Dog(Scooby,Doberman)")
  }

  it should "test Case classes have automatic properties" in {
    val d1 = Dog("Scooby", "Doberman")

    d1.name should be("Scooby")
    d1.breed should be("Doberman")
  }
}
