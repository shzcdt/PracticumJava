package HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practicum {

    private static Map<String, String> films = new LinkedHashMap<>(4, 0.5F, true);

    public static void main(String[] args) {
        films.put("Титаник", "Джеймс Кэмерон");
        films.put("Гарри Потер и философский камень", "Крис Коламбус");
        films.put("Хакеры", "Иэн Софтли");
        films.put("Терминатор", "Джеймс Кэмерон");

        System.out.println(films.get("Титаник"));
        for (String film : films.keySet()) {
            System.out.println(film);
        }
    }
}
