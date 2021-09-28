import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbersToTen(){
        assertEquals(10,calculator.add(5,5));
    }

    @Test
    public void subtractNumbersToThree(){
        assertEquals(3, calculator.subtract(9,6));
    }

    @Test
    public void multiplyNumbersToSixteen(){
        assertEquals(16, calculator.multiply(4,4));
    }

    @Test
    public void divideNumbersToPointOne(){
        assertEquals(0.1, calculator.divide(7,70), 0.001);
    }
}
