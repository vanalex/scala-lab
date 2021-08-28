package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class MultilineStringTest {

  @Test
  def testmultiline(): Unit = {
    val expected = s"""Welcome!
  Hello!
  * (Gratuitous Star character!!)
                      |This line has a margin indicator.
                      |  This line has some some extra whitespace.""".stripMargin

    assertEquals(MultilineString.value, expected)
  }
}
