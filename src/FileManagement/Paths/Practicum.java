package FileManagement.Paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Practicum {
    public static void main(String[] args) {

        Path myFavouriteFilePath =
                Paths.get("C:\\users\\username\\desktop\\favouriteFile.txt");

        System.out.println(myFavouriteFilePath);
    }
}
