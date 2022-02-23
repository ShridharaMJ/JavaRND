package  ProgramPractice;

public class CheckNoInString {

	public static void checkNos(String str) {
		str=str.replaceAll("[^0-9]", "");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		checkNos("Testing Purpose");
	}
}
