package Exceptions.Throw;

public class Practicum {
    public static void main(String[] args) {
        try {
            System.out.println(getPositiveInteger("10"));
            System.out.println(getPositiveInteger("abc"));
        } catch (NumberShouldBePositiveException exception) {
            System.out.println("Число должно быть положительным");
        } catch (IncorrectInputStringException exception) {
            System.out.println("Необходимо ввести число");
        }
    }

    public static int getPositiveInteger(final String input)
            throws NumberShouldBePositiveException, IncorrectInputStringException {
        try {
            int value = Integer.parseInt(input);
            if (value < 0) {
                throw new NumberShouldBePositiveException();
            }
            return value;
        } catch (NumberFormatException exception){
            throw new IncorrectInputStringException();
        }
    }
}

class NumberShouldBePositiveException extends Exception {
}

class IncorrectInputStringException extends Exception {
}