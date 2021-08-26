package variance

trait Recipe[+A] {
  def name: String
  def ingredients: List[A]
}
