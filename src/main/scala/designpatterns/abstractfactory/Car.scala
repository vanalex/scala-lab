package designpatterns.abstractfactory

abstract class Car {
  def bookingPrice: Double
  def brands: List[String]
  def availability: Int
  def book(numberOfCars: Int)
}
