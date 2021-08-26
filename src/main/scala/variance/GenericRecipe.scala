package variance

case class GenericRecipe(ingredients: List[Food]) extends Recipe[Food] {
  def name: String = s"Generic recipe based on ${ingredients.map(_.name)}"
}
