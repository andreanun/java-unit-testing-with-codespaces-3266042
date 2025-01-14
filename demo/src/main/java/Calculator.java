public class Calculator {
  
  public int sum(int x, int y) {
    return x + y;
  }

  public int subtract(int x, int y) {
    return x - y;
  }

  public int multiply(int x, int y){
    return x * y;
  }

  public int divide(int x, int y) {
    if (y == 0 ) { return -1;}
    return x / y;
  }

  public boolean isEven(int z) {
    return z % 2 == 0;
  }

  // public boolean isOdd(int z) {
  //   return z % 2 == 1;
  // }


}
