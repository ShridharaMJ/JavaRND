package  ProgramPractice;

public class PrintDuplicateChar {

	
public static void printDuplicate(String str) {
	int count=0;
str=str.toLowerCase();
char[] strref=str.toCharArray();
for (int i = 0; i < strref.length; i++) {
	for (int j = i+1; j < strref.length; j++) {
		if(strref[i]==strref[j]) {
			count++;
		}
	}
	
	if(count>=2) {
		System.out.println(strref[i]+" "+count);
	}
	count=0;
}
}

public static void main(String[] args) {
	printDuplicate("Edenred");
}
}
