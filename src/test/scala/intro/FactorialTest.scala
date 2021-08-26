package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class FactorialTest {

  @Test
  def testFactorial(): Unit ={
    val result = Factorial.fact(5, 1)
    assertEquals(result, BigInt(120))
  }
}
