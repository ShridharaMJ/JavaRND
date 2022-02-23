package  ProgramPractice;

public class LengthOfString {

	public static int getStringLength(String str) {
		int length;
		str=str.replace(" ", "");
		
	length=str.length();
		return length;
		
	}
	
	
	public static void main(String[] args) {
		
		int get = getStringLength("This is for learning purpose");
		System.out.println(get);
	}
}
