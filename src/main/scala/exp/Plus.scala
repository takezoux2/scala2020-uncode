package exp

case class Plus(left: Int, right: Int) {

  def calc() = {
    MyNumber(left + right + 1)
  }
}

// 地味にファイル名以外のクラスが入っているのもポイント

case class Minus(left: Int, right: Int){

}
class MinusFunc(m: Minus) {
  def calc() = {
    m.left - m.right
  }
}
object Minus {
  implicit def to(m: Minus) = {
    new MinusFunc(m)
  }
}

case class Mul(left: Int, right: Int) {

}