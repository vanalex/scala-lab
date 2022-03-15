package classes

import basicoop.TermUtil
import basicoop.TermUtil.isIdentityFun
import model.{App, Fun, Var}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TermTest extends AnyFlatSpec with Matchers{

  it should "case classes examples" in {
    val id = Fun("x", Var("x"))
    TermUtil.printTerm(id)
    val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    TermUtil.printTerm(t)
    println(isIdentityFun(id))
    println(isIdentityFun(t))
  }
}
