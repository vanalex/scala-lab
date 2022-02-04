package exercises

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MapTest extends AnyFlatSpec with Matchers {

  it should "test map size" in {
    val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.size should be(4)
  }

  it should "test map should not contain idential items" in {
    val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
    myMap.size should be(3)
  }

  it should "test map item can be added to easily" in {
    val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
    val aNewMap = myMap + ("IL" -> "Illinois")
    aNewMap.contains("IL") should be(true)
  }

  it should "test map can be iterated easily" in {
    val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")

    val mapValues = myMap.values
    mapValues.size should be(3)
    mapValues.head should be("Michigan") //Failed presumption: The order in maps is not guaranteed

    val lastElement = mapValues.last
    lastElement should be("Wisconsin")
  }

  it should "test accesing map" in {
    val myMap =
      Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap("MI") should be("Michigan")
    myMap("IA") should be("Iowa")
  }
}
