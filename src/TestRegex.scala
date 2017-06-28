/**
  * Created by sinocall on 2017/6/8.
  */
import scala.util.matching.Regex

object TestRegex{

  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    var str = "Scala is Scalable and cool"

    println(pattern.findFirstIn(str))

    val pattern1 = new Regex("(s|S)cala")

    println((pattern.findAllIn(str)).mkString(","))
  }
}
