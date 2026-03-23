package FunctionStyle.WithFunctionStyle.AnonymousClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>(List.of(
                "Мария Зуева",
                "Анна Дарк",
                "Кирилл Филимонов",
                "Ева Пинк"
        ));

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.split(" ")[1].length(), o2.split(" ")[1].length());
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
