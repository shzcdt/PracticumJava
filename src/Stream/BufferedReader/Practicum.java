package Stream.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practicum {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("bufferedReader.txt");
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()) {
            String line = br.readLine();
            System.out.println(line);
        }

        br.close();
    }
}
