import scala.util.control.Breaks

/**
  * Created by sinocall on 2017/6/6.
  */

object Test{

  def main(args: Array[String]): Unit ={
//    loop();
//    for_i_to_j();
    for_i_until_j();
//    forMultiPhase();
//    forList();
//    forFilter();
//    forYield();
    println(addInt(1,3))
  }

  def loop(): Unit ={
    var a = 0 ;
    val numList = List(1,2,3,4,5,6,7,8);

    val loop = new Breaks;
    loop.breakable{
      for(a <- numList){
        println("Value of a :"+a);
        if( a==4 ){
          loop.break;
        }
      }
    }
  }

  def for_i_to_j(): Unit ={
    var a = 0 ;
    for(a <- 1 to 10){
      println("Value of a :"+ a);
    }


  }

  def for_i_until_j(): Unit ={
    var a = 0 ;
    for(a <- 1 until 10){
      println("Value of a :"+a);
    }
  }

  def forMultiPhase(): Unit ={
    var a = 0 ;
    var b = 0 ;
    for(a <- 1 to 3 ; b<- 1 to 4){
      println("Value of a :"+ a);
      println("Value of b :"+b);
    }
  }

  def forList(): Unit ={
    var a = 0 ;
    val numList = List(1,2,3,4,5,6);
    for(a <- numList){
      println("Value of a :"+a);
    }
  }

  def forFilter(): Unit ={
    var a = 0 ;
    val numList = List(1,2,3,4,5,6,7);
    for(a <- numList
          if a!=3; if a<5){
      println("Value of a :"+a);
    }
  }

  def forYield(): Unit ={
    var a = 0 ;
    val numList = List(1,2,3,4,5,6,7,8);
    var retVal = for{
      a <- numList if a<3;if a>1
    }yield  a

    for(a <- retVal){
      println("Value of a :"+a);
    }
  }

  def addInt(a:Int,b:Int):Int = {
    var sum :Int = 0 ;
    sum = a+b ;
    return  sum ;
  }
}
