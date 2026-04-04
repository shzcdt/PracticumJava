package Tests.Calculator;

import Tests.TestLibrary;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldGive5whenAdd2and3() {
        int a = 3;
        int b = 2;
        int expectedSum = 5;

        int resultSum = calculator.add(a, b);

        TestLibrary.asserEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGive2whenSubtrack5and3() {
        int a = 5;
        int b = 6;
        int expectedSubtrack = -1;

        int resultSubtrack = calculator.subtrack(a, b);

        TestLibrary.asserEquals(expectedSubtrack, resultSubtrack);
    }

    @Test
    public void shouldGive0whenMultiply5and0() {
        int a = 5;
        int b = 0;
        int expectedMultiply = 0;

        int resultMultiply = calculator.multiply(a, b);

        TestLibrary.asserEquals(expectedMultiply, resultMultiply);
    }


    public static void main(){
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.shouldGive5whenAdd2and3();
    }
}
