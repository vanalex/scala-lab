package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class TupleTest {

  @Test def testTuple(): Unit =
    assertEquals(Tuple3("hello","world","bye"), Tuples.returnTuple("hello", "world", "bye"))

  @Test def testTupleOperations(): Unit ={
    val t = ("Hello", 1, 2.3)
    assertEquals(t.toString(), "(Hello,1,2.3)")
    assertEquals(t._1, "Hello")
    assertEquals(t._2, 1)
    assertEquals(t._3, 2.3, 0.0)
  }
}
