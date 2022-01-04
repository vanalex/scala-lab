package exercises

import intro.Factorial
import org.junit.Assert.assertEquals
import org.junit.Test

class AssertsTest {

  @Test
  def testScalaNativeAssertAsFalse(): Unit ={
    val left = 2
    val right = 1
    assert(left != right)
  }

  @Test
  def testScalaNativeAssertAsTrue(): Unit ={
    val left = 1
    val right = 1
    assert(left == right)
  }

}
