package intro

object Factorial {

  def fact(i: Int, accumulator: BigInt): BigInt = {
    if (i <= 1) accumulator
    else fact(i - 1, i * accumulator)
  }

}
