package designpatterns.generics

class IntAssert[Int](val value: Int) extends AbstractAssert[Int]{
  override def isEqualTo(a: Int): Boolean = value.equals(a)
}
