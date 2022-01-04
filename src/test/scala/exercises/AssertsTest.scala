package exercises

import intro.Factorial
import org.junit.Assert.assertEquals
import org.junit.Test
import org.scalatest.matchers.should.Matchers.equal
import org.scalatest.*
import matchers.should.*
import org.scalatest.flatspec.AnyFlatSpec

class AssertsTest extends AnyFlatSpec with Matchers{

  it should "test scala native assert as false" in {
    val left = 2
    val right = 1
    assert(left != right)
  }

  it should "test scala native assert as true" in {
    val left = 1
    val right = 1
    assert(left == right)
  }

  it should "test equality with matches" in {
    val result = 3
    result should equal(3)
    result should equal (3) // can customize equality
    result should === (3)   // can customize equality and enforce type constraints
    result should be (3)    // cannot customize equality, so fastest to compile
    result shouldEqual 3    // can customize equality, no parentheses required
    result shouldBe 3
  }
}
