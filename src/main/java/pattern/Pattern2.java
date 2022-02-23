package  pattern;

public class Pattern2 {

	
public static void main(String[] args) {
	
	int count;
	for (int i = 1; i < 10; i++) {
		count = 1;
		for (int j = 1; j <i; j++) {
			System.out.print(" "+ count);
			count++;
		}
		
		System.out.println(" ");
		
	}
}
}
