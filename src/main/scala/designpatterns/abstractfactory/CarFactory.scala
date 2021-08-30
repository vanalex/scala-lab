package designpatterns.abstractfactory

object CarFactory {

  def build(carType: Int): Car = {
    carType match {
      case 0 => new StandardCar()
      case 1 => new DeluxeCar()
      case 2 => new LuxuryCar()
      case _ => new StandardCar()
    }

  }
}
