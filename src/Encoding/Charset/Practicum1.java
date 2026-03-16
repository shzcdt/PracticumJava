package Encoding.Charset;

import java.nio.charset.StandardCharsets;

public class Practicum1 {
    public static void main(String[] args) {
        String s = "Обычная строчка";
        byte[] buffer1 = s.getBytes(StandardCharsets.UTF_8);

        byte[] buffer2 = new byte[1000];
        String str = new String(buffer2, StandardCharsets.UTF_8);
    }
}
