package Stream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Practicum {
    public static void main(String[] args) throws IOException {
        Writer fileWriter = new FileWriter("fileWriter.txt", true);

        fileWriter.write("новая запись в новый файл\n");
        fileWriter.write("добавляем текст");

        fileWriter.close();
    }
}
