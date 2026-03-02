package Set;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practicum {

    private static Set<String> issuedCards = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(issuedCards.add("3688 2836 2367 0847"));
        issuedCards.add("5742 3473 8754 2934");
        issuedCards.add("5647 8372 9456 1028");
        issuedCards.add("9873 4356 9837 0928");
        issuedCards.add("1873 2984 0938 8756");
        issuedCards.add("9958 3984 3398 2090");
        issuedCards.add("2229 3823 9576 7465");
        issuedCards.add("3688 2836 2367 0847"); // его нет в множестве

        String newCard = generateNewCard();

        System.out.println(issuedCards);

        System.out.println("Номер карты: " + newCard + " свободен? " + !issuedCards.contains(newCard));

        System.out.println("\nПрактика методов addAll и add:");

        List<String> allNames = new ArrayList<>();
        allNames.add("Марья");
        allNames.add("Перт");
        allNames.add("Светлана");
        allNames.add("Кристина");
        allNames.add("Иван");
        allNames.add("Макс");
        allNames.add("Светлана");
        allNames.add("Иван");

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(allNames);

        System.out.println("Количество имен в списке allNames " + allNames.size());
        System.out.println("Количество имен в множестве uniqueNames " + uniqueNames.size());

        System.out.println("\nПрактика метода contains():");

        System.out.println("Есть ли в множестве имен имя Ахмед? " + uniqueNames.contains("Ахмед"));
        uniqueNames.add("Ахмед");

        System.out.println(uniqueNames);
        uniqueNames.remove("Ахмед");
        System.out.println(uniqueNames);

        System.out.println("Пустое ли множество uniqueNames: " + uniqueNames.isEmpty());
        uniqueNames.clear();
        System.out.println("Пустое ли множество uniqueNames: " + uniqueNames.isEmpty());

        System.out.println("Закончил изучать Set и Tree, все в конспекте");
    }

    public static String generateNewCard() {
        return "2932 0984 2984 0988";
    }
}
