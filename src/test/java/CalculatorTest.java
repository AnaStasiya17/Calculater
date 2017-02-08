
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Dmitriy on 28.01.2017.
 */


public class CalculatorTest {

    @Test
    public void simpleTest() {
        Calculator calculator = new Calculator();
        String[] args = {"2", "+", "2"};
        assertEquals(4, calculator.calculate(args));
    }

    @Test
    public void maxValue() {
        Calculator calculator = new Calculator();
        String[] args = {"99999999", "+", "0"};
        assertEquals(99999999, calculator.calculate(args));
    }

    @Test
    public void maxNegativeValue() {
        Calculator calculator = new Calculator();
        String[] args = {"-99999999", "-", "0"};
        assertEquals(-99999999, calculator.calculate(args));
    }


    @Test
    public void maxNegativeErrorValue() {
        Calculator calculator = new Calculator();
        String[] args = {"-99999999", "-", "1"};
        assertEquals(-100000000, calculator.calculate(args));


    }

    @Test
    public void maxErrorValue() {
        Calculator calculator = new Calculator();
        String[] args = {"99999999", "+", "1"};
        assertEquals(100000000, calculator.calculate(args));


    }

    @Test
    public void maxNegativeValueDoubleError() {
        Calculator calculator = new Calculator();
        String[] args = {"-99999998.9", "-", "1"};
        assertEquals(-100000000, calculator.calculate(args));


    }

    @Test
    public void maxValueDoubleError() {
        Calculator calculator = new Calculator();
        String[] args = {"99999998.9", "+", "1"};
        assertEquals(100000000, calculator.calculate(args));

    }

    @Test
    public void ValueDoubleInLow() {
        Calculator calculator = new Calculator();
        String[] args = {"13.2", "+", "1"};
        assertEquals(14, calculator.calculate(args));

    }

    @Test
    public void ValueDouble() {
        Calculator calculator = new Calculator();
        String[] args = {"98.5", "+", "1"};
        assertEquals(100, calculator.calculate(args));


    }

    @Test
    public void NegativeValueDouble() {
        Calculator calculator = new Calculator();
        String[] args = {"-14.6", "-", "1"};
        assertEquals(-16, calculator.calculate(args));


    }


    @Test
    public void NegativeValueDoubleInLow() {
        Calculator calculator = new Calculator();
        String[] args = {"-14.4", "-", "1"};
        assertEquals(-15, calculator.calculate(args));


    }

}


