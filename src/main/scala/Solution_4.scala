object Solution_4 extends App{
  def test_4(str : String): String = {
    if (str.startsWith("If")) str
    else  "If "+ str


  }
  println(test_4("If I had a bought a ticket that day, I would have won a prize"))
  println(test_4("you don't drink enough water, you get thirsty"))


}
