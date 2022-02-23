package collectionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class DemoProperties {
public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	FileInputStream fs=new FileInputStream("abc.properties");
	p.load(fs);

	//System.out.println(	p.getProperty("UserName"));
	
	FileOutputStream os=new FileOutputStream("abc.properties");
	//p.setProperty("name", "MJS");
	
	Enumeration enu = p.propertyNames();
	System.out.println(enu);
	
}

}
