package TryWithResources;

import java.io.*;

public class Practicum {
    public static void main(String[] args) throws IOException {
        try (Reader fileReader = new FileReader("file.txt")) { // ресурс try

            // что-то делаем с потоком

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
