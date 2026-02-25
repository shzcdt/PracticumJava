package Generic.Interface;

import java.util.ArrayList;
import java.util.List;

public class Practicum{
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter();
        GeneralPrinter<Double> doublePrinter = new GeneralPrinter<>();

        doublePrinter.print(2d);

        List<Double> expenses = new ArrayList<>();
        expenses.add(100.5);
        expenses.add(500.0);
        expenses.add(1000.6);
        System.out.println("\nТраты пользователя:");
        for (Double i : expenses){
            System.out.println(i);
        }

        List<String> pets = new ArrayList<>();
        pets.add("Кот");
        pets.add("Хомяк");
        pets.add("Кролик");

        System.out.println("\nСписок домашних животных:");
        for (String pet : pets){
            System.out.println(pet);
        }
    }
}
