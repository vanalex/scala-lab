package intro

import intro.PartialFunctions.func
import model.{Circle, Draw, Point}
import org.junit.Test

class PartialFunctionsTest{

  @Test
  def testHuman(): Unit ={
    assert(PartialFunctions.squareRoot(4.0) == 2.0)
  }

  @Test
  def testMessages(): Unit ={
    assert(func(Draw(Circle(Point(0.0,0.0), 1.0))) == "Got Draw(Circle(Point(0.0,0.0),1.0))")
  }
}
