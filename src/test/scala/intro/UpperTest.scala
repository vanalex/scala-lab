package intro

import org.junit.Assert.{assertEquals, assertSame}
import org.junit.Test

class UpperTest {

  @Test def testUpper(): Unit =
    assertEquals("HELLO", Upper.upper("hello"))

  @Test def testConvert(): Unit =
    assertEquals(List("HELLO","BYE"), Upper.convert(List("hello", "bye")))


}
