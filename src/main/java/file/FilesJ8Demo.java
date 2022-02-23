package  file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesJ8Demo {
public static void main(String[] args) throws IOException {
	
	// Files.list(Paths.get("D:\\")).forEach(System.out::println);
	 //Files.walk(Paths.get("D:\\Eclipse_Workspace")).forEach(System.out::println);
	 boolean anyMatch = Files.walk(Paths.get("D:\\Eclipse_Workspace")).anyMatch(f->f.getFileName().toString().equals("FileDemo123.java"));
	 System.out.println(anyMatch);
	
}
}
