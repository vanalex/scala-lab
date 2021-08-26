package variance

import org.junit.Assert.{assertEquals, assertThat, assertTrue}
import org.junit.Test

class RestaurantTest {

  @Test
  def testRestaurant(): Unit = {
    val foodList = List("chicken", "beef", "pumpkin", "carrot")
    val chicken = new Meat("chicken")
    val beef = new Meat("beef")
    val pumpkin = new Vegetable("pumpkin")
    val carrot = new Vegetable("carrot")
    val mixRecipe = new GenericRecipe(List(chicken, carrot, beef, pumpkin))
    assertTrue(foodList.contains(mixRecipe.ingredients(0).name))
    assertTrue(foodList.contains(mixRecipe.ingredients(1).name))
    assertTrue(foodList.contains(mixRecipe.ingredients(2).name))
    assertTrue(foodList.contains(mixRecipe.ingredients(3).name))

    val will = new WhiteMeatChef
    val whiteMeat = new WhiteMeat("white meat")
    val whiteMeatList = List(whiteMeat)
    val whiteMeatRecipe = WhiteMeatRecipe(whiteMeatList)
    val whiteMeatFoodList = List("white meat", "read meat")
    assertTrue(whiteMeatFoodList.contains(whiteMeatRecipe.ingredients(0).name))

    val alfredo = new MeatChef
    val meat = new Meat("meat")
    val meatRecipe = MeatRecipe(List(meat))
    assertEquals(alfredo.cook(meatRecipe), "I made a Generic recipe based on List(meat)")
  }
}
