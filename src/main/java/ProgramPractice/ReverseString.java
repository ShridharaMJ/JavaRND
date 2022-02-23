package  ProgramPractice;

public class ReverseString {
  
	public static String getReversredString(String s) {
		char[] original = s.toCharArray();
		int len=s.length();
	
		char copied[]=new char[len];
		int c=0;
		
		for (int i = len-1; i >0; i--) {
			copied[c]=original[i];	
			c++;	
}
		
	return new String(copied)	;
	
	}
	
	public static void main(String[] args) {
		
		String Test = ReverseString.getReversredString("Shridhara");
		System.out.println("Reversed String is "+Test);
	}
}
