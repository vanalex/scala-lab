package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class TupleTest {

  @Test def testTuple(): Unit =
    assertEquals(Tuple3("hello","world","bye"), Tuples.returnTuple("hello", "world", "bye"))
}
