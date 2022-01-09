package basicoop.objects

class Person (
  val name: String,
  private val superHeroName: String)

object Person{
  def showMeInnerSecret(x: Person) = x.superHeroName
}
