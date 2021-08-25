package intro

import org.junit.Test

class PartialFunctionsTest{

  @Test
  def testHuman(): Unit ={
    assert(PartialFunctions.squareRoot(4.0) == 2.0)
  }
}
