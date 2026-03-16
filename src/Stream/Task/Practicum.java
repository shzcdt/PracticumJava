package Stream.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practicum {
    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> result = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);



        while (br.ready()) {
            String line = br.readLine();
            String[] parts = line.split(" ");

            String surname = parts[0];
            String vote = parts[1];

            List<String> surnames = result.getOrDefault(vote, new ArrayList<>());

            surnames.add(surname);

            result.put(parts[1], surnames);
        }

        System.out.println(result);
        br.close();
    }
}
