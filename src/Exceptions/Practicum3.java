package Exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practicum3 {
    public static void main(String[] args) {
        try {
            System.out.println(addToMap(new HashMap<>(), "test", "test"));
            System.out.println(addToMap(new HashMap<>(), null, null));
            System.out.println(addToMap(new TreeMap<>(), "test", "test"));
            System.out.println(addToMap(new HashMap<>(), null, null));

            System.out.println(addToMap(Map.of(), "test", "test"));
        } catch (NullPointerException exp){
            System.out.println("Ошибка: переданна нулевая ссылка");
        } catch (UnsupportedOperationException exp){
            System.out.println("Ошибка: реализация не поддерживает добавление новых объектов");
        }
    }

    public static Map<String, Object> addToMap(final Map<String, Object> storage,
                                               final String key, final Object value){
        storage.put(key, value);
        return storage;
    }
}
