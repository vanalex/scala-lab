package intro

object Mean {
  def apply (d: Double, ds: Double *): Double = apply (d +: ds)
  def apply (ds: Seq[Double] ): Double = ds.sum / ds.size
}
