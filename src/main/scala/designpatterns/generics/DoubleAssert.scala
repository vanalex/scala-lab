package designpatterns.generics

class DoubleAssert[Double] (val value: Double) extends AbstractAssert[Double]{
  override def isEqualTo(a: Double): Boolean = value.equals(a)
}
