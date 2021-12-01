import org.scalatest.funsuite.AnyFunSuite

class test_5 extends AnyFunSuite{
  test("test5"){
    assert(solution_5.test_5(89, 99) === 99)
    assert(solution_5.test_5(100, 100) === 0)
    assert(solution_5.test_5(98, 56) === 98)
  }

}
