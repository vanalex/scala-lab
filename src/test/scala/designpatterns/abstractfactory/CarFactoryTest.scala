package designpatterns.abstractfactory

import org.junit.Assert.assertEquals
import org.junit.Test

class CarFactoryTest {

  @Test
  def testAbstractFactory(): Unit={
    var car = CarFactory.build(CarType.STANDARD)
    assertEquals(car.brands, List("Maruti", "Tata", "Hyundai"))

    car = CarFactory.build(CarType.LUXURY)
    assertEquals(car.brands, List("Audi","BMW", "Mercedes"))

    car = CarFactory.build(CarType.DELUXE)
    assertEquals(car.brands, List("Honda", "Mahindra", "Chevrolet"))
  }
}
