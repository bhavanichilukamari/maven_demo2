import org.scalatest.funsuite.AnyFunSuite

class test_7 extends AnyFunSuite{

  test("solution_7"){
    assert(Solution_7.happychar("Apple",0) === "Not Happy")
    assert(Solution_7.happychar("Apple",2) === "Happy")
  }

}
