package ic

import exp.{Minus, Mul, MyNumber, Plus}

trait Implicits {

  implicit def toFunc(plus: Plus) = {
    new PlusFunc(plus)
  }
  implicit def toMinusFunc(m: Minus) = {
    new MinusFunc(m)
  }


  implicit def toMulFunc(m: Mul) = {
    new MulFunc(m)
  }

  implicit def toNumFunc(n: MyNumber) = {
    new NumFunc(n)
  }
}


class PlusFunc(plus: Plus) {
  def calc() = {
    MyNumber(plus.left + plus.right)
  }
}
class MinusFunc(plus: Minus) {
  def calc() = {
    MyNumber(plus.left - plus.right)
  }
}

class MulFunc(mul: Mul) {
  def calc() = {
    MyNumber(mul.left * mul.right)
  }
}

class NumFunc(n: MyNumber) {
  def toInt() = {
    n.n
  }

  def asString() = n.n.toString()
}
