package GenericInterfaceStream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practicum2 {
    public static void main(String[] args) {

//        citiesToVisit.stream() // Структура построения потока
//                .intermediateOperation1() // промежуточные операции
//                .intermediateOperation2()
//                .intermediateOperation3()
//                .intermediateOperation4()
//                .someTerminalOperation(); // терминальные операции


        System.out.println("Использование count в Stream");

        long count = Stream.of("Компиляторы убийцы", "Спринг", "Алгоритмы")
                .count();
        System.out.println(count);

        System.out.println("Использование forEach в Stream");

        List<String> citiesToVisit = List.of("Лондон", "Мадрид", "Владивосток");
        citiesToVisit.stream()
                .forEach(System.out::println);

        System.out.println("Использование allMatch в Stream");

        boolean isAllUppercased = Stream.of("фильм Компилятор-убийца", "сериал Спринг", "сериал Алгоритмы", "фильм скобки")
                .allMatch(title -> title.startsWith("фильм"));
        System.out.println("Сегодня показывают только фильмы? " + isAllUppercased);

        System.out.println("Использование anyMatch в Stream");


        boolean found = Stream.of("фильм Компилятор-убийца", "сериал Спринг", "сериал Алгоритмы", "фильм скобки")
                .anyMatch(title -> title.toLowerCase().contains("спринг"));
        System.out.println("Есть и что-то про спринг? " + found);

        System.out.println("Использование findFirst в Stream");
        Optional<String> maybeFound = Stream.of("фильм Компилятор-убийца", "сериал Спринг", "сериал Алгоритмы", "фильм скобки")
                .filter(title -> title.startsWith("сериал"))
                .findFirst();
        if (maybeFound.isPresent()){
            System.out.println("Сериал найден: " + maybeFound.get());
        } else {
            System.out.println("Сериалов в программе нет. ");
        }

        System.out.println("Использование collect в Stream");
        String text = Stream.of("фильм Компилятор-убийца", "сериал Спринг", "сериал Алгоритмы", "фильм скобки")
                .collect(Collectors.joining(" // ")); // разделитель
        System.out.println("Текстом: " + text);

        // Собираем в список
        List<String> collected = Stream.of("фильм Компилятор-убийца", "сериал Спринг", "сериал Алгоритмы", "фильм скобки")
                .collect(Collectors.toList());
        System.out.println("Списком: " + collected);
    }
}
