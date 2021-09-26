package designpatterns.generics

class LongAssert[Long] (val value: Long) extends AbstractAssert[Long]{
  override def isEqualTo(a: Long): Boolean = value.equals(a)
}
