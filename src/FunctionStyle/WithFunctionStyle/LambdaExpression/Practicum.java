package FunctionStyle.WithFunctionStyle.LambdaExpression;

import java.util.Comparator;
import java.util.function.Consumer;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Реализация через абстрактный класс функц. интерфейса Consumer");

        Consumer<String> greeter1 = new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println("Привет, " + name + "!");
            }
        };

        greeter1.accept("Дарья");

        System.out.println("Реализация того же интерфейса через лямбда-функцию");

        Consumer<String> greeter2 = (String name) -> {
            System.out.println("Привет, " + name + "!");
        };

        greeter2.accept("Дарья");

        System.out.println("Продолжаем использовать лямбда-выражения. Еще более сокращенный вариант");

        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();

        System.out.println(comparator.compare("Привет", "Дарья"));
    }
}
