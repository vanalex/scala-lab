package model

abstract class Shape {
  def draw(f: String => Unit): Unit = f(s"draw: $this")
}
