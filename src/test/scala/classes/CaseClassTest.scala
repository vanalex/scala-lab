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

  case class Dog(var name: String, breed: String) // you can rename a dog, but change its breed? nah!
  it should "test Case classes can have mutable properties" in {
    val d1 = Dog("Scooby", "Doberman")

    d1.name should be("Scooby")
    d1.breed should be("Doberman")

    d1.name = "Scooby Doo" // but is it a good idea?

    d1.name should be("Scooby Doo")
    d1.breed should be("Doberman")
  }

  it should "alternatives for altering case classes" in {
    case class Dog(name: String, breed: String) // Doberman
    val d1 = Dog("Scooby", "Doberman")
    val d2 = d1.copy(name = "Scooby Doo") // copy the case class but change the name in the copy

    d1.name should be("Scooby") // original left alone
    d1.breed should be("Doberman")

    d2.name should be("Scooby Doo")
    d2.breed should be("Doberman")
  }

  it should "Case classes can have default and named parameters" in {
    case class Person(first: String, last: String, age: Int = 0, ssn: String = "")
    val p1 = Person("Fred", "Jones", 23, "111-22-3333")
    val p2 = Person("Samantha", "Jones") // note missing age and ssn
    val p3 = Person(last = "Jones", first = "Fred", ssn = "111-22-3333") // note the order can change, and missing age
    val p4 = p3.copy(age = 23)

    p1.first should be("Fred")
    p1.last should be("Jones")
    p1.age should be(23)
    p1.ssn should be("111-22-3333")

    p2.first should be("Samantha")
    p2.last should be("Jones")
    p2.age should be(0)
    p2.ssn should be("")

    p3.first should be("Fred")
    p3.last should be("Jones")
    p3.age should be(0)
    p3.ssn should be("111-22-3333")

    (p1 == p4) should be(true)
  }
}
