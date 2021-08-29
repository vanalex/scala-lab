package intro

import org.junit.Assert.assertEquals
import org.junit.Test

class SubsetTest{
  @Test
  def testSubset(): Unit = {
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska"  -> "Juneau",
      "Wyoming" -> "Cheyenne")

    assertEquals(stateCapitals.get("Alabama"), Some("Montgomery"))
    assertEquals(stateCapitals.get("Wyoming"), Some("Cheyenne"))
    assertEquals(stateCapitals.get("Unknown"), None)

    assertEquals(stateCapitals.getOrElse("Alabama", "Oops1"), "Montgomery")
    assertEquals(stateCapitals.getOrElse("Wyoming", "Oops2"), "Cheyenne")
    assertEquals(stateCapitals.getOrElse("Unknown", "Oops3"), "Oops3")

  }
}
