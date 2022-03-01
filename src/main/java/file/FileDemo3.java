package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo3 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("TesFile.txt");
        //fw.write(99);
        fw.write("Shridhara\nIs a Software test engineer");
        fw.write("\n");
        char[] ch = {'a', 'j', 't'};
        fw.write(ch);
        fw.flush();
        fw.close();
    }
}
