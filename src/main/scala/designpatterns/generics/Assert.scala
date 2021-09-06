package designpatterns.generics

object Assert {

  def assert(value: String): AbstractAssert[String] = {
    new StringAssert(value)
  }

  def assert(value: Int): AbstractAssert[Int] = {
    new IntAssert(value)
  }

  def assert(value: List[Any]): AbstractAssert[List[Any]] = {
    new ListAssert(value)
  }

  def assert(value: Long): AbstractAssert[Long] = {
    new LongAssert(value)
  }

  def assert(value: Double): AbstractAssert[Double] = {
    new DoubleAssert(value)
  }
}
