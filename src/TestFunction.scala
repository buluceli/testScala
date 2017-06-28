import java.util.Date

/**
  * Created by sinocall on 2017/6/6.
  */
object TestFunction {

  def main(args: Array[String]): Unit = {
    delayed(time())
//    varialbleArgs("hello","python","scala")
    /*for(i <- 1 to 10){
      println(factorial(i));
    }*/
//    println(apply(layout,10));
    /*println(factorial(0));
    println(factorial(1));
    println(factorial(2));
    println(factorial(3));
    println(factorial(4));*/
   /* var inc = (x:Int) => x+1
    println(inc(2))*/
    /*var userDir = () => {System.getProperty("user.dir")}
    println(userDir())*/

   /* val date = new Date();
    val logWithDateBound = log(date,_:String);
    logWithDateBound("message1");
    Thread.sleep(100);
    logWithDateBound("message2");*/

   /* val str1:String = "hello"
    val str2:String = "scala"
    println("str1+str2="+strcat(str1)(str2))*/

//    format();
  }

  def time()={
    println("获取时间，单位为纳秒")
    System.nanoTime();
  }
  //传名调用
  def delayed(t: =>Long)={
    println("在delayed 方法内")
    println("参数："+t);
    t
  }

  //可变参数
  def varialbleArgs(args:String*): Unit ={
    var i : Int = 0 ;
    for(arg <- args ){
      println("Arg value["+i+"]="+arg);
      i = i+1 ;
    }
  }

  //递归函数
  def factorial(n:BigInt):BigInt={
    if (n<=1){
      1
    }else{
      n*factorial(n-1)
    }
  }

  //高阶函数 apply() 函数使用了另外一个函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v：
  def apply(f: Int => String,v : Int)=f(v)

  def layout[A](x:A) = "["+x.toString()+"]"

  //内嵌函数  定义在函数内的函数称之为局部函数
  def factorial(i:Int) : Int = {
    def fact(i :Int,accumulator :Int):Int = {
      if(i<=1)
        accumulator
      else
        fact(i-1,i*accumulator)
    }
    fact(i,1);
  }

  //偏应用函数
  def log(date : Date,message : String): Unit ={
    println(date+ "---"+message)
  }

  //函数科里化
  def strcat(s1:String)(s2:String)={
    s1+s2
  }

  def format(): Unit ={
    var floatVar = 12.345
    var intVar = 2000
    var stringVar = "cainiao.com"
    var fs = printf("浮点类型为："+"%f,整型变量为%d,字符串为 %s",floatVar,intVar,stringVar)
  }
}
