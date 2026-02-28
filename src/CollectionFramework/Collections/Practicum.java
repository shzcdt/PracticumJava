package CollectionFramework.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Привет мир!");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

        System.out.println(emptyList);
        System.out.println(singletonList);
        System.out.println(nCopiesList);

        System.out.println();
        System.out.println("Использование Collections.fill(List<T>, T)");

        List<Long> listOfLong = new ArrayList<>();
        listOfLong.add(157231421L);
        listOfLong.add(213214542L);
        listOfLong.add(2183421848190484012L);

        System.out.println("До сортировки: ");
        System.out.println(listOfLong);

        System.out.println("После сортировки: ");

        Collections.fill(listOfLong, 555555L);
        System.out.println(listOfLong);

        System.out.println();
        System.out.println("Использование Collection.copy: ");

        List<Long> listOfSmallLongs = new ArrayList<>();
        listOfSmallLongs.add(1L);
        listOfSmallLongs.add(2L);
        listOfSmallLongs.add(3L);

        List<Long> listOfBigLongs = new ArrayList<>();
        listOfBigLongs.add(10000000000L);
        listOfBigLongs.add(20000000000L);
        listOfBigLongs.add(30000000000L);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        Collections.copy(listOfSmallLongs, listOfBigLongs);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        System.out.println();
        System.out.println("Использование метода Collections.sort(List<T>, Comparator<T>)");

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Гуава");
        fruits.add("Груша");

        System.out.println(fruits);

        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);
    }
}
