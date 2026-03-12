package Exceptions.PrintStackTrace;

public class Practicum {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println(exception);
        }

    }

    public static int calculate() {
        return 10/0;
    }
}
