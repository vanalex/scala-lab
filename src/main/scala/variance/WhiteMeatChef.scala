package variance

class WhiteMeatChef extends Chef[WhiteMeat]{
  def specialization: String = "White Meat"

  override def cook(recipe: Recipe[WhiteMeat]): String = s"I made a ${recipe.name}"
}
