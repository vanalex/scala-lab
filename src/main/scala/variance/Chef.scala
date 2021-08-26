package variance

trait Chef[-A] {
  def specialization: String
  def cook(recipe: Recipe[A]): String
}
