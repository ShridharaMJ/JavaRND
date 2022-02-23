package  ProgramPractice;

import java.util.Arrays;

public class FindDuplicaeElementAndCount {

	public static void findDuplicate(String str) {
		int count = 0;
		char[] chararray=str.toCharArray();
		char[] duplicar=RemoveDuplicateElement.removeDupCha(str).toCharArray();
		System.out.println(RemoveDuplicateElement.removeDupCha(str));
		
		for (int i = 0; i < duplicar.length; i++) {
			for (int j = 0; j < chararray.length; j++) {
				if(duplicar[i]==chararray[j]) {
					count++;
				}
			}
			
			if(count>1) {
				System.out.println(duplicar[i]+" "+count);
			
		}
			count=0;
	}
	}
	public static void main(String[] args) {
		findDuplicate("mmjsjsjokjsdiohuihIjjjjssmmm");
	}
	
	
}
