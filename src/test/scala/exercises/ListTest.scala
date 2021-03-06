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

  it should "test list access" in {
    val a = List(1, 2, 3)
    a.headOption should equal(Some(1))
    a.tail should equal(List(2, 3))

    val b = List(1, 3, 5, 7, 9)
    b(0) should equal(1)
    b(2) should equal(5)
    b(4) should equal(9)
  }

  it should("test Lists are immutable") in {
    val a = List(1, 3, 5, 7, 9)
    val b = a.filterNot(v => v == 5) // remove where value is 5

    a should equal(List(1, 3, 5, 7, 9))
    b should equal(List(1, 3, 7, 9))
  }

  it should("test Lists utilities") in {
    val a = List(1, 3, 5, 7, 9)

    // get the length of the list
    a.length should equal(5)

    // reverse the list
    a.reverse should equal(List(9, 7, 5, 3, 1))

    // map a function to double the numbers over the list
    a.map { v =>v * 2} should equal(List(2, 6, 10, 14, 18))

    // filter any values divisible by 3 in the list
    a.filter { v =>v % 3 == 0} should equal(List(3, 9))

    val b = List(1, 2, 3)

    b.map {_ * 2} should equal(List(2, 4, 6))

    b.filter {_ % 2 == 0} should equal(List(2))

    val c = List(1, 2, 3)
    c.map(_ * 2) should equal(List(2, 4, 6))
    c.filter(_ % 2 != 0) should equal(List(1, 3))
  }

  it should("Functions over list can use _ as shorthand") in {
    val a = List(1, 2, 3)
    a.map {_ * 2} should equal(List(2, 4, 6))
    a.filter {_ % 2 == 0} should equal(List(2))
  }

  it should("Functions over lists can use () instead of {}:") in {
    val a = List(1, 2, 3)
    a.map(_ * 2) should equal(List(2, 4, 6))
    a.filter(_ % 2 != 0) should equal(List(1, 3))
  }

  it should("Lists can be reduced with a mathematical operation:") in {
    val a = List(1, 3, 5, 7)
    a.reduceLeft(_ + _) should equal(16)
    a.reduceLeft(_ * _) should equal(105)
  }

  it should("foldLeft is like reduce, but with an explicit starting value:") in {
    val a = List(1, 3, 5, 7)
    // NOTE: foldLeft uses a form called currying that we will explore later
    a.foldLeft(0)(_ + _) should equal(16)
    a.foldLeft(10)(_ + _) should equal(26)
    a.foldLeft(1)(_ * _) should equal(105)
    a.foldLeft(0)(_ * _) should equal(0)
  }

  it should("create list from a range") in {
    val a = (1 to 5).toList
    a should be(List(1, 2, 3, 4, 5))
  }

  it should ("You can prepend elements to a List to get a new List:") in {
    val a = List(1, 3, 5, 7)
    0 :: a should be(List(0, 1, 3, 5, 7))
  }

  it should ("Lists can be concatened and Nil is an empty List:") in {

    val head = List(1, 3)
    val tail = List(5, 7)

    head ::: tail should be(List(1, 3, 5, 7))
    head ::: Nil should be(List(1, 3))
  }
}
