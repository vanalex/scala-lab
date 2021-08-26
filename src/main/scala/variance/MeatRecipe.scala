package variance

case class MeatRecipe(ingredients: List[Meat]) extends Recipe[Meat] {
  def name: String = s"Generic recipe based on ${ingredients.map(_.name)}"
}
