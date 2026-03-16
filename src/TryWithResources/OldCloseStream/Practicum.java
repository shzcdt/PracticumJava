package TryWithResources.OldCloseStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Practicum {
    public static void main(String[] args) throws IOException {
        Reader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");

            // как-то взаимодействуем с потоком
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                fileReader.close();
            }
        }
    }
}
