package Optional;

import java.util.List;
import java.util.Optional;

public class Practicum {
    public static Optional<String> longestName(List<Optional<String>> maybeNames) {
        int max = 0;
        Optional<String> strMax = Optional.empty();
        for (Optional<String> str : maybeNames) {
            if (str.isPresent()) {
                if (max < str.get().length()) {
                    max = str.get().length();
                    strMax = str;
                }
            }
        }

        return strMax;
    }

    public static void main(String[] args) {
        Optional<String> longest = longestName(List.of(
                Optional.of("Max"),
                Optional.empty(),
                Optional.of("Alexey"),
                Optional.empty(),
                Optional.empty(),
                Optional.of("Alex")
        ));
        if (longest.isPresent()) {
            System.out.println("Самое длинное имя состоит из " + longest.get().length() + " символов");
            System.out.println(longest);
        } else {
            System.out.println("Слов не встретилось");
        }
    }
}
