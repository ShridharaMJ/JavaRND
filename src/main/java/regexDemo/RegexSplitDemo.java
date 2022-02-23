package  regexDemo;

import java.util.regex.Pattern;

public class RegexSplitDemo {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\w");
		String[] m = p.split("T2his is te2sting purp2ose  jhfkjjfdsjk.kjanfsdkjnka.afskl ");
		for (String string : m) {
			System.out.println(string);
		}
		
		
	}
	
}
