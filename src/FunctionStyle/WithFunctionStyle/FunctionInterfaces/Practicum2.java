package FunctionStyle.WithFunctionStyle.FunctionInterfaces;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practicum2 {
    public static void main(String[] args) {
        Supplier<Double> randomDoubleSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        Double supplied = randomDoubleSupplier.get();
        System.out.println(supplied);


        Predicate<String> tooLongPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 100;
            }
        };

        String name = "Агафья";
        System.out.println("Слишком ли длинное имя " + name + "?");
        System.out.println("Ответ: " + tooLongPredicate.test(name));


        Function<String, Integer> nameToLengthFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        String name2 = "Марк";
        System.out.println("Сколько букв в имени " + name2 + "?");
        System.out.println("Ответ: " + nameToLengthFunction.apply(name2));
    }
}
