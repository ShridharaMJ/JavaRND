package regexDemo;

public class RegexSplitDemoStrings {
public static void main(String[] args) {
	String s1="This is t2esting p2urpose kjjhH kjdhAHUN 686897 #$%^&*";
	String[] sarra  =s1.split("\\d");
	for (String string : sarra) {
		System.out.println(string);
	}
}
}
