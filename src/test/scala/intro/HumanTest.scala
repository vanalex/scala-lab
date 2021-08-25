package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class HumanTest {

  @Test
  def testSquareRoot(): Unit ={
    val p = new Human("Alex", 39)
    assertEquals(p.name, "Alex")
    assertEquals(p.age, 39)
    //p.name = "Alexx"
    p.age = 40
    assertEquals(p.age, 40)
  }
}
