package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        Map<String, Boolean> shoppingList = new HashMap<>();

        shoppingList.put("Яблоки", true);
        shoppingList.put("Авокадо", false);
        shoppingList.put("Мандарины", false);

        System.out.println("Список покупок: " + shoppingList);

        System.out.println();
        System.out.println();

        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);
        citiesPopulation.put("Париж", 8_000_000);

        String city = "Париж";
        if (citiesPopulation.containsKey(city)) {
            Integer cityPopulation = citiesPopulation.get(city);
            System.out.println("Через 1 год вот столько будет людей: " + cityPopulation + " в " + city);

        } else {
            System.out.println("Информации по этому городу у нас, к сожалению, нет");
        }

        System.out.println(citiesPopulation.size());
        System.out.println(citiesPopulation.isEmpty());
        citiesPopulation.remove("Лондон");
        System.out.println(citiesPopulation);

        System.out.println("\nСмотрю на работу метода remove");
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        data.put("key3", "value3");

        System.out.println("Содержимое хеш-таблицы data: " + data);

        String key1Value = data.remove("key1");
        System.out.println("Значение, которое раньше хранилось по ключу key1: " + key1Value);

        System.out.println("Содержимое хеш-талицы data: " + data);

        String key5Value = data.remove("key5");
        System.out.println("Значение, которое раньше хранилось по ключу key1: " + key5Value);

        System.out.println(citiesPopulation.entrySet());
    }
}

