object Solution_7 extends App {
  def happychar(str:String,n:Int): String = {
    val l = str.length
    if(n>=0 && n<l) {
      if(n==l-1) {
        if(str.charAt(n) == str.charAt(n-1)) "Happy"
        else "Not Happy"
      }
      else if(n == 0){
        if(str.charAt(n) == str.charAt(n+1)) "Happy"
        else "Not Happy"
      }
      else if (str.charAt(n) == str.charAt(n - 1) || str.charAt(n) == str.charAt(n + 1)) "Happy"
      else "Not Happy"
    }
    else "Please provide Valid Index"
  }

  println(happychar("Apple",0))
  println(happychar("Apple",2))

}


