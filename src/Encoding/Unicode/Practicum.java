package Encoding.Unicode;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Practicum {
    public static void main(String[] args) {
        Charset charset1 = Charset.forName("utf8");
        System.out.println(charset1.name());

        Charset chatset2 = StandardCharsets.US_ASCII;
        System.out.println(chatset2);
    }
}
