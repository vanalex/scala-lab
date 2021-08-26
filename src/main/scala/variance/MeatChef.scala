package variance

class MeatChef extends Chef[Meat] {
  def specialization: String = "Meat"

  override def cook(recipe: Recipe[Meat]): String = s"I made a ${recipe.name}"
}
