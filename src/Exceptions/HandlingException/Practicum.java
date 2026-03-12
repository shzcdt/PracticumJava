package Exceptions.HandlingException;

public class Practicum {
    public static void main(String[] args) {
        try {
            System.out.println(IntegerConverter.convert("10"));
        } catch (Throwable exception){
            System.out.println("Строка для преобразования не является целым числом");
        }

        try {
            System.out.println(IntegerConverter.convert("abc10"));
        } catch (Throwable exception){
            System.out.println("Строка для преобразования не является целым числом");
        }
    }
}