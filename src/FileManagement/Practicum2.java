package FileManagement;

import com.sun.security.jgss.GSSUtil;

import java.io.File;

public class Practicum2 {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {
        File dir = new File(HOME + File.separator + "NewDir");
        File dir1 = new File(HOME);
        boolean created = dir.mkdir();

        if (created) {
            System.out.println("Директория создана");
        }

        dir.renameTo(new File(HOME + File.separator + "NewDirRenamed"));

        boolean deleted = dir.delete();
        if (deleted) {
            System.out.println("Директория удалена");
        }
        System.out.println(dir.getAbsolutePath());
    }
}
