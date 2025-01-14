import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int expected = 3;

    int actual = calculator.sum(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testSubtract() {
    int expected = -1;
    int actual = calculator.subtract(1, 2);

    assertEquals(expected, actual);

  }

  @Test
  public void testMultiply() {
    int expected = 12;
    int actual = calculator.multiply(3,4);

    assertEquals(expected, actual);

  }

  @Test
  public void testDivide() {
    int expected = 3;
    int actual = calculator.divide(12, 4);

    assertEquals(expected, actual);
    
  }

  @Test
  public void testDivideByZero() {
    int expected = -1;
    int actual = calculator.divide(12, 0);

    assertEquals(expected, actual);
  
  }

  @Test
  public void testIsEven() {
    boolean actual = calculator.isEven(2);

    assertTrue(actual);
  }

  @Test
  public void testIsOdd() {
    boolean actual = calculator.isEven(3);

    assertFalse(actual);
  }



}
