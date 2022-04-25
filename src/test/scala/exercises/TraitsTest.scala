package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TraitsTest extends AnyFlatSpec with Matchers {

  it should "trait example" in {
    val evt = Event("Moose Stampede")
    val myListener = new MyListener
    myListener.listen(evt) should be("An unfortunate moose stampede occurred")
  }
}
case class Event(name: String)

trait EventListener {
  def listen(event: Event): String
}

class OurListener

class MyListener extends OurListener with EventListener {
  def listen(event: Event): String = {
    event match {
      case Event("Moose Stampede") =>
        "An unfortunate moose stampede occurred"
      case _ => "Nothing of importance occurred"
    }
  }
}