package Tests;

import org.junit.Test;

public class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue999() {
        int buySum = 999;
        int expectedSum = 999;

        int resultSum = discountCalculator.sunAfterDiscount(buySum);

        TestLibrary.asserEquals(expectedSum, resultSum);
    }

    public static void main(String[] args) {
        DiscountCalculatorTest test = new DiscountCalculatorTest();
        test.shouldGiveNoDiscountForValue999();
    }
}
