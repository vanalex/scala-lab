package designpatterns.abstractfactory

class LuxuryCar extends Car{
  private var _availability = 5
  override def bookingPrice = 900000
  override def brands = List("Audi","BMW", "Mercedes")
  override def availability = _availability
  override def book(noOfCars:Int) = {
    _availability = _availability - noOfCars
  }
}
