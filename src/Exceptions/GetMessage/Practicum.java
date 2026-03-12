package Exceptions.GetMessage;

public class Practicum {
    public static void main(String[] args) {
        try {
            System.out.println(parseIntegerWithOffset("19"));
        } catch (Exception exception){
            if (exception.getMessage().equals("out of bounds")) { // getMessage возвращает null
                System.out.println("Произошел выход за границы");
            }
        }
    }

    public static int parseIntegerWithOffset(String input) {
        return Integer.parseInt(input, 10, 12, 10);
    }
}
