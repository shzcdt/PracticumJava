package Tests;

public class DiscountCalculator {

    public int sunAfterDiscount(int sum) {
        if (sum < 1000) {
            return sum;
        } else {
            return (int) (sum * 0.98);
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.sunAfterDiscount(2000));

        System.out.println("Тест");
    }
}

