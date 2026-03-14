package FileManagement;

import java.io.File;

public class Practicum1 {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {
        File dir = new File(HOME);


        if (dir.isDirectory()){

            for (File item : dir.listFiles()){
                if (item.isDirectory()) {
                    System.out.println("Каталог: " + item.getName());
                } else {
                    System.out.println("Файл: " + item.getName());
                }
            }
        }
    }
}
