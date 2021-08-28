package intro

object MultilineString {

  def value = s"""Welcome!
  Hello!
  * (Gratuitous Star character!!)
                 |This line has a margin indicator.
                 |  This line has some some extra whitespace.""".stripMargin
}
