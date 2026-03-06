package String;

import org.w3c.dom.ls.LSOutput;

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

        System.out.println("\nПрактика charAt:");

        String soManyMethods = "Опять много методов!";

        System.out.println(soManyMethods.charAt(5));
        System.out.println(soManyMethods.charAt(2));
        System.out.println(soManyMethods.charAt(4));
        System.out.println(soManyMethods.charAt(14));
        System.out.println(soManyMethods.charAt(1));


        System.out.println("\nСоздаем метод, который проверяет, что какая-то подстрока встречается в строке " +
                "только один раз");

        var os = new OnlySubstring();
        System.out.println(os.onlySingleSubstring("раз два три, раз два", "раз"));
        System.out.println(os.onlySingleSubstring("раз два ", "раз"));

        System.out.println("\nПрактика substring");

        String str = "Всем привет! Я строка";
        System.out.println(str.substring(4));
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(5, 11));
        System.out.println(str.substring(13));

        CardNumberMasker masker = new CardNumberMasker();
        System.out.println("\nСкрытый номер " + masker.maskCardNumber("1234567890"));

        System.out.println("\nПрактика replace и replaceFirst");

        String example = "раз два, раз два";
        System.out.println(example.replace("раз", "три"));
        System.out.println(example.replaceFirst("раз", "три"));
    }
}

