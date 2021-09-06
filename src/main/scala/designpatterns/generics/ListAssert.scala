package designpatterns.generics

class ListAssert[List](val list: List) extends AbstractAssert[List]{
  override def isEqualTo(a: List): Boolean = list.equals(a)
}
