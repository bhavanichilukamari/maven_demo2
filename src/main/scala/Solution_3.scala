object Solution_3 extends App{
  def test_3(str: String): String ={
    val str_1 = str.length
    val str_2 = str.charAt(str_1 - 1)
    val str_3 = str_2 + str + str_2
    str_3
  }
  println(test_3("Scala"))

}
