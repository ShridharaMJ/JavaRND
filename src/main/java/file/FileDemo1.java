package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f = new File("Cricket");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
