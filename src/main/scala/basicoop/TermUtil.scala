package basicoop

import model.{App, Fun, Term, Var}

object TermUtil {

  def printTerm(term: Term) = {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
      case App(f, v) =>
        print("(")
        print(" ")
        print(")")
    }
  }

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }
}
