object solution_5 extends App{
  def test_5(x:Int, y : Int): Int ={
    val x_value  = Math.abs(x - 100)
    val y_value = Math.abs(y -  100)

    if (x_value == y_value) 0
    else  if (x_value < y_value) x
    else y
  }
  println(test_5(89,99))
  println(test_5(100,100))
  println(test_5(98,56))
}
