import ic.Implicits

object Main extends Implicits{
  def main(args: Array[String]): Unit = {

    println(Parser.calculate("1 2 + 3 *").asString)


    println(Parser.calculate("1 4 + 3 *").asString)

  }
}