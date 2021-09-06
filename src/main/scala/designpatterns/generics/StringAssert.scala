package designpatterns.generics

class StringAssert[String](val value: String) extends AbstractAssert[String] {

  override def isEqualTo(a: String): Boolean = value.equals(a)
}
