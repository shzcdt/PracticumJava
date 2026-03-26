package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Practicum {
    public static Optional<String> longestName(List<String> names) {
        if (names.isEmpty()){
            return Optional.empty();
        }
        String maxName = names.get(0);
        for (String name : names){
            if (name.length() > maxName.length()){
                maxName = name;
            }
        }

        return Optional.of(maxName); // создание обертки со значением maxName
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Optional<String> longest = longestName(names);
        if (longest.isPresent()){
            System.out.println("Самое длиноое имя состоит из " + longest.get().length() + " символов");
            System.out.println(longest);
        } else {
            System.out.println("Такого имени нет");
        }
    }
}
