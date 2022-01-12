package exercises

import basicoop.objects.Greeting
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TupleTest extends AnyFlatSpec with Matchers {

  it should "test simple tuple" in {
    val tuple = new Tuple1("a")
    val value = tuple._1
    value should be("a")
  }

  it should "test tuple2" in {
    val tuple = new Tuple2("a", 2)
    val value1 = tuple._1
    val value2 = tuple._2
    value1 should be("a")
    value2 should be(2)
  }

  it should("tuple can have different types") in {
    val tuple4 = ("a", 1, 2.2, "five")
    tuple4._1 should be("a")
    tuple4._3 should be(2.2)
  }
}