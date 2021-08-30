package designpatterns.abstracttypes

trait ContainerAT {
  type T
  val data: T

  def compare(other: T) = data.equals(other)
}
