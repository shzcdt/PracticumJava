package FileManagement.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Practicum {
    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) throws IOException {
        Path testFile =
                Files.createFile(Paths.get(HOME, "testFile.txt"));

        if (Files.exists(Paths.get(HOME, "testFile.txt"))) {
            System.out.println("Файл успешно создан");
        }

        Path testDirectory = Files.createDirectory(Paths.get(HOME,
                "testDirectory"));

        if (Files.exists(Paths.get(HOME, "testDirectory"))){
            System.out.println("Директория успешно создана");
        }

        testFile = Files.move(testFile, Paths.get(HOME, "testDirectory", "testFile.txt"));


        Files.deleteIfExists(testFile);
        Files.deleteIfExists(testDirectory);
    }
}
