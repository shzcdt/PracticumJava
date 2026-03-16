package Encoding.Charset;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Practicum2 {
    public static void main(String[] args) {
        try (Writer out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            out.write(decodeText(
                    "Съешь еще этих мягких французских булок да выпей чаю"
            ));
        } catch (IOException e){
            // игнорируется
        }
    }

    static String decodeText(String input) throws IOException {
        return String.valueOf(new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8
        )));
    }
}
