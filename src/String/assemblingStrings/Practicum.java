package String.assemblingStrings;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Запись строки без форматирования: ");
        String[] colors = new String[]{"красный", "желтый", "зеленый"};

        String trafficLights = "Цвета светофора: " + colors[0] + ", " + colors[1] + ", " + colors[2];

        System.out.println("\nЗапись строки через форматирование: ");

        String trafficLights2 = String.format("Цвета светофора: %s, %s и %s", colors[0], colors[1], colors[2]);
        System.out.println(trafficLights2);

        System.out.println("\nДополнителные параметры символов преобразования: ");

        String pizza = "Пицца, 1 шт., 310.50";
        String tee = "Чай, 1 шт., 113.30";
        String cookies = "Печенье, 1 уп., 75.75";

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[0]);
        System.out.printf("%35s", pizza);
        System.out.println();
        System.out.println(numbers[1]);
        System.out.printf("%35s", tee);


        System.out.println("\nПрактика разделения строки");
        String students = "Примечание1* Примечание2* Примечание3";

        String[] split = students.split("\\*");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println("\nПрактика преобразования массива в строку:");

        String[] arrayOfPets = new String[]{
                "Кот Батончик",
                "Хомяк Рафаэль",
                "Попугай Картошка"
        };

        String pets = String.join(", ", arrayOfPets);

        System.out.println("Мои питомцы: " + pets);

    }
}
