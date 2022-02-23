package  ProgramPraactice1;

public class OccranceOfChar {

	
public static int coountChar(String str,char ch) {
	int count=0;
	
	char[] str_chars=str.toCharArray();
	for(int i=0;i<str_chars.length;i++) {
		if(ch==str_chars[i]) {
			count++;
		}
	}
	return count;

}

public static void checkOccuranceOfChar(String str) {
str=str.toLowerCase().replace(" ", "");
while(str.length()>0) {
	char ch=str.charAt(0);
	System.out.println(ch +" "+coountChar(str, ch));
	str=str.replace(""+ch, "");
}
}



public static void main(String[] args) {
	checkOccuranceOfChar("Edenred");

}
}
