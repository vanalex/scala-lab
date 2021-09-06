package designpatterns.generics

abstract class AbstractAssert[A] {

  def isEqualTo(a: A): Boolean
}
