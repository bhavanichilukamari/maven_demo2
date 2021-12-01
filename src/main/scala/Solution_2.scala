object Solution_2 extends App{
  def test_2(str:String, num : Int): String = {

    val newString = str.take(num)+str.drop(num+1)
    newString
  }

  println(test_2("scala",0))
  println(test_2("scala",1))
  println(test_2("scala",4))


}
