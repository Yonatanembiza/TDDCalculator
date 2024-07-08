import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoIntegers(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testSubtractTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtractTwoIntegers(2, 3);
        assertEquals(-1, result);
    }
    @Test
    public void testMultiplyTwoIntegers(){
        Calculator calculator = new Calculator();
        double result = calculator.multiplyTwoIntegers(2, 3);
        assertEquals(6, result);
    }
    @Test
    public void testDivideTwoIntegers(){
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoIntegers(6, 3);
        assertEquals(2, result);
    }
    @Test
    public void testModuloTwoIntegers(){
        Calculator calculator = new Calculator();
        int result = calculator.moduloTwoIntegers(6, 2);
        assertEquals(0, result);
    }
}
