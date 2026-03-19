package MyExperiments;

import java.io.FileWriter;
import java.io.IOException;

public class Practicum {
    public static void main(String[] args) {

        try (FileWriter write = new FileWriter("notes3.csv", false)){
            String text = "Hello gitHub";
            write.write(text);

            write.append("\n");
            write.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
