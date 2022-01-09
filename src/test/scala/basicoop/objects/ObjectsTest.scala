package basicoop.objects

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ObjectsTest extends AnyFlatSpec with Matchers{

  it should "test Object method greeting in english" in {
    val greeting = Greeting.english
    greeting should equal("Hi")
  }

  it should "test Object method greeting in spanish" in {
    val greeting = Greeting.spanish
    greeting should equal("Hola")
  }

  it should "test companion object" in {
    val movie = Movie.academyAwardsBestMovieForYear(1932)
    movie.get.name should equal("Grand Hotel")
    movie.get.year should equal(1932)
  }

  it should "test companion private values and variables" in {
    val clark = new Person("Clark Kent", "Superman")
    val peter = new Person("Peter Parker", "Spider-Man")

    Person.showMeInnerSecret(clark) should equal("Superman")

    clark.name should equal("Clark Kent")
    peter.name should equal("Peter Parker")
  }
}