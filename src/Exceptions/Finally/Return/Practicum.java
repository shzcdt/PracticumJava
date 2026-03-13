package Exceptions.Finally.Return;

public class Practicum {
    public static void main(String[] args) {
        System.out.println(returnFromFinally());
    }

    public static int returnFromFinally() {
        try {
            return calculate(10, 2);
        } catch (Exception exc) {
            return 1;
        } finally {
            System.out.println("2");
        }
    }

    public static int calculate(int a, int b) {
        return a / b;
    }
}
