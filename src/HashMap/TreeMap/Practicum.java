package HashMap.TreeMap;

import HashMap.User;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Practicum {
    public static void main(String[] args) {
        Comparator<User> userComparator = new Comparator<>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Map<User, String> users = new TreeMap<>(userComparator);

        fillWithData(users);
        System.out.println("Пользователи: ");
        for (Map.Entry<User, String> entry : users.entrySet()){
            System.out.println(entry);
        }
    }

    private static void fillWithData(Map<User, String> users) {
        users.put(new User(545, "Николай"), "Россия");
        users.put(new User(8934, "Томас"), "Португалия");
        users.put(new User(45, "Иван"), "Франция");
        users.put(new User(5758, "Лили"), "Италия");
        users.put(new User(247, "Ву-конг"), "Гонконг");
    }
}
