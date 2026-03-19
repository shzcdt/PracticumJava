package MyExperiments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Practicum2 {
    public static void main(String[] args) {
        String content = "Hello, World!";
        Path filePath = Paths.get("example.txt");

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("Файл успешно записан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
