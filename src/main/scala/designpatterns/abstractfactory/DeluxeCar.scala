package designpatterns.abstractfactory

class DeluxeCar extends Car {
  private var _availability = 50
  override def bookingPrice = 500000
  override def brands = List("Honda", "Mahindra", "Chevrolet")
  override def availability = _availability
  override def book(noOfCars:Int) = {
    _availability = _availability - noOfCars
  }
}
