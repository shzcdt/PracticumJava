package CollectionFramework;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Практика изучения интерфейса Iterable<T>");
        final ArrayList<String> list = new ArrayList<>();
        list.add("\nHello");
        list.add(" ");
        list.add("fcking");
        list.add(" ");
        list.add("World!");

        final Iterator<String> iterator;
        iterator = list.iterator();

        while (iterator.hasNext()){
            final String element = iterator.next();
            System.out.print(element);
        }
        for (String element : list) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println("\nПрактка изучения интерфейса Collection<T>");

        final Collection<String> color = new ArrayList<>();
        color.add("Желтый");
        color.add("Красный");
        color.add("Зеленый");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Зеленый");
        colorsAdditional.add("Желтый");

        color.addAll(colorsAdditional);
        System.out.println(color);

        System.out.println("Список содержит Зеленый: " + color.contains("Зеленый"));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Желтый");
        color.removeAll(yellowOnly);

        System.out.println(color);
        System.out.println("Оставшееся количество элементов: " + color.size());
        System.out.println("Коллекция пустая? " + color.isEmpty());

        System.out.println();
        System.out.println("Практика изучения интерфейса List<T>");
        List<Long> list1 = new ArrayList<>();

        list1.add(0L);
        list1.add(1L);
        list1.add(2l);
        System.out.println(list1);

        list1.add(2, 22L);
        System.out.println(list1);

        list1.add(4,4L);
        System.out.println(list1);

        list1.remove(4);
        list.remove(2L);
        System.out.println(list1);

        System.out.println(list1.get(2));

        System.out.println();

        final List<String> cats = new ArrayList<>();

        cats.add("Маркиз");
        cats.add("Принцесса");
        cats.add("Пирожок");
        cats.add("Мурка");

        System.out.println(cats);
//        cats.remove(1);
//        cats.remove(2);
//
//        cats.add("Лев");
//        System.out.println(cats);

        cats.remove(1);
        cats.set(2, "Лев");
        System.out.println(cats);

        System.out.println();
        System.out.println("От массива к списку: ");

        String[] citiesArray = {"Воронеж", "Южно-Сахалинск", "Иркутск"};
        List<String> cities = Arrays.asList(citiesArray);
        List<String> cities1 = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");

        // теперь метод list.of(...)

        String[] citiesArray1 = {"Воронеж", "Южно-Сахалинск", "Иркутск"};

        List<String> cities2 = List.of(citiesArray1);
        System.out.println(cities2);

        List<String> otherCities = List.of("Амстердам", "Токио", "Рим");
        System.out.println(otherCities);
    }
}
