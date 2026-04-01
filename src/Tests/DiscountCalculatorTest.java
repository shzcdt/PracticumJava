package Tests;

public class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

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
