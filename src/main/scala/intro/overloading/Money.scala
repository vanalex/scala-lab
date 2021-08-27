package intro.overloading

case class Money(value: BigDecimal) {

  case object Money {
    def apply(s: String): Money = new Money(BigDecimal(s.toDouble))

    def apply(d: Double): Money = new Money(BigDecimal(d))
  }

}
