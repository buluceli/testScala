/**
  * Created by sinocall on 2017/6/6.
  */
object CollectionTest{

  def main(args: Array[String]): Unit = {
//    list()
//    set()
    map()
  }

  def list(): Unit ={
    val site : List[String] = List("Runoob","baidu")

    val nums : List[Int] = List(12,3,4)

    val empty : List[Nothing] = List();

    val dim : List[List[Int]] = List(
      List(4,5),
      List(7,8)
    )

    println(site.head)
    println(site.tail)
    println(site.isEmpty)

    val site2 : List[String] = List("google","facebook")
    var site3 = site:::site2
    println(site3(2))

    var site4 = site3.reverse
    println(site3(0))
    println(site4(0))

    var nums2 = List.tabulate(3)(a =>a*9)
    var nums3 = List.tabulate(4,5)(_*_)

    var site6 = List.fill(3)("hell")

    val x = List(1)
    val y = 2+:x
    println(y)

    var sb = new StringBuilder;
    site.addString(sb,"_")
    println(sb)

    println(site.apply(1))
    println(site.contains("baidu"))

    var site7 = "baidu"+:site
    println(site7)
    var site8 = site7.distinct
    println(site8)


  }

  def set(): Unit ={
    val set = Set(3,5,4,5)
    println(set.getClass.getName)

    println(set)
    println(set.exists(_%2==0))
    println(set.drop(1))

    println(set.min)

    val set2 = Set(9,20,33)
    var set3 = set ++ set2
    println(set3)


    var set4 = set.&(set3)
    println(set4)
    var set5 = set.intersect(set4)
    println(set5)

    var set6 = set5 + 88
    println(set6)

    var set7 = set6 - 5
    println(set7)

    var set8 = set7.&~(set6)
    println(set8)

    var set9 = set8.+(4,3,5,69)
    println(set9)

    var set10 = set7.++(set9)
    println(set10)

    var count = set10.count(a =>a>9)
    println(count)

    var accumulate = set10.product
    println(accumulate)

    var set11,set12 = set10.splitAt(3)
    println(set11+ " "+ set12)
  }

  def map(): Unit ={
    var a:Map[Char,Int] = Map()

    val colors = Map("red" ->"#FF0000")

    a += ('I' -> 1)

    println(a)

    println(a.keys)
    println(a.values)

    a.keys.foreach{
      i => println("key = "+i +" value="+a(i))
    }

    println(a.contains('I'))
    var map1 :Map[Char,Int]= Map('K' -> 8)
    var map2 = a.++(map1)
    println(map2)

    println(map2.default('I'))




  }
}
