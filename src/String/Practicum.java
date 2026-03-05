package String;

import java.sql.SQLOutput;

public class Practicum {
    public static void main(String[] args) {

        String one = "Привет!";
        String two = "Привет!";

        String three = new String("Привет!");

        System.out.println(one == two);
        System.out.println(one == three);

        System.out.println(one.equals(two));
        System.out.println(one.equals(three));

        String moscow = "Москва";

        System.out.println(moscow.toString().toString().toString());

        String empty = " fdasfadsfasd   adsfadsf    ";
        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());
        System.out.println(empty.trim());

        System.out.println();
        System.out.println("Практика с подстроками");

        String start = "Hello, world!";

        System.out.println(start.indexOf("world", 10));
        System.out.println(start.lastIndexOf("world", 10));
    }
}
