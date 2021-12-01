object solution_6 extends App{

  def test_6(x: Int, y: Int): Boolean ={
    val condition =  x >= 20 && y <= 50  ||  x <= 20 && y >= 50
    if (condition == true) true
    else false
  }
  println(test_6(25,60))
  println(test_6(25,25))
}
