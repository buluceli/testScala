/**
  * Created by sinocall on 2017/6/6.
  */
import Array._
object ArrayTest{
  def main(args: Array[String]): Unit = {
    var array1 = apply(3,5)
    println(array1(0))

    var array2 = apply(6,7)
    var array3 = concat(array1,array2)
    println(array3(3))

    copy(array1,0,array3,3,1)
    println(array3(3))

    var array4 = empty

    var array5 = iterate(0,3)(a=>a+1)
    println(array5(2))

    var array6 = fill(3)(4)
    for(i <- array6){
      print(i+" ")
    }

    var array7 = ofDim[String](3)

    var array8 = range(1,10,1)

    var array9 = tabulate(3)(a =>a*7)
    println(array9(2))
  }
}
