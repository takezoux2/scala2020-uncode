import exp.{Minus, Mul, MyNumber, Plus}
import ic.Implicits

object Parser extends Implicits{

  def calculate(exp: String) = {

    exp.foldLeft((List[MyNumber](),""))({
      case ((_stack, _temp), c) => {
        val stack = if(!c.isDigit && _temp.length > 0) {
          MyNumber(_temp.toInt) :: _stack
        } else {
          _stack
        }
        val temp = if(c.isDigit) _temp else ""
        c match {
          case '+' =>{
            stack match {
              case v1 :: v2 :: left => {
                (Plus(v1.toInt(),v2.toInt()).calc() :: left,temp)
              }
            }
          }
          case '-' =>{
            stack match {
              case v1 :: v2 :: left => {
                (Minus(v1.toInt(),v2.toInt()).calc() :: left,temp)
              }
            }
          }
          case '*' =>{
            stack match {
              case v1 :: v2 :: left => {
                (Mul(v1.toInt(),v2.toInt()).calc() :: left,temp)
              }
            }
          }
          case ' ' =>{
            (stack, "")
          }
          case c if c.isDigit =>{
            (stack, temp + c)
          }
          case _ => throw new Exception("Unknown token " + c)
        }
      }
    })._1.head
  }

}
