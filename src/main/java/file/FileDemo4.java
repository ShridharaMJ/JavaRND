package file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File f = new File("TestFolder");
        f.mkdir();
        File f3 = new File("TestFolder", "Excell.xlsx");
        f3.createNewFile();
    }
}
