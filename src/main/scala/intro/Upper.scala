package intro

object Upper {
  def upper(value: String): String = value.toUpperCase

  def convert(strings: List[String]): List[String] = strings.map(_.toUpperCase).toList

  def upper(params: String*): String =
    params.map(_.toUpperCase).mkString(" ")
}
