package collectionPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("abc.properties");
        Properties p = new Properties();
        p.load(fi);
        System.out.println(p.getProperty("URL"));
        System.out.println(p.getProperty("UserName"));
        System.out.println(p.getProperty("Password"));

    }

}
