package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListTest extends AnyFlatSpec with Matchers{

  it should "test equality list" in {
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a eq b) should be(false)
  }

  it should "test same content list" in {
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a == b) should be(true)
  }

  it should "test nil on list" in {
    val a: List[String] = Nil
    val b: List[Int] = Nil

    (a == Nil) should be(true)
    (a eq Nil) should be(true)
    (b == Nil) should be(true)
    (b eq Nil) should be(true)
    //(a == b) should be(true)
    (a eq b) should be(true)
  }

  it should "test list creation" in {
    val a = List(1, 2, 3)
    a should equal(List(1, 2, 3))
  }
}
