import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.example.code.Calculator;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5), 0);
        assertEquals(0, calculator.add(-2, 2), 0);
        assertEquals(-3, calculator.add(-1, -2), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5), 0);
        assertEquals(-4, calculator.subtract(-2, 2), 0);
        assertEquals(1, calculator.subtract(-1, -2), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5), 0);
        assertEquals(-4, calculator.multiply(-2, 2), 0);
        assertEquals(2, calculator.multiply(-1, -2), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5), 0);
        assertEquals(-1, calculator.divide(-2, 2), 0);
        assertEquals(0.5, calculator.divide(-1, -2), 0);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
