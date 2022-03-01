package file;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        int i = 0;

        try {
            fr = new FileReader("TesFile.txt");
            i = fr.read();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }

    }
}
