package designpatterns.abstractfactory

class StandardCar extends Car{

  private var _availability = 100

  override def bookingPrice: Double = 200000

  override def brands: List[String] = List("Maruti", "Tata", "Hyundai")

  override def availability: Int = 100

  override def book(numberOfCars: Int) = {
    _availability = _availability - numberOfCars
  }
}
