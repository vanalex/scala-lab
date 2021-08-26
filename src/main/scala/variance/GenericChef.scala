package variance

class GenericChef extends Chef[Food]{
  def specialization: String = "All fodd"

  override def cook(recipe: Recipe[Food]): String = s"I made a ${recipe.name}"
}
