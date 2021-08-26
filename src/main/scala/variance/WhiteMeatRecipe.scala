package variance

case class WhiteMeatRecipe(ingredients: List[WhiteMeat]) extends Recipe[WhiteMeat] {
  def name: String = s"Generic recipe based on ${ingredients.map(_.name)}"
}
