package  ProgramPractice;

import java.util.Arrays;

public class Annagram {
	
                                      	
	public static boolean checkAnnagram(String str1,String str2) {
    if(str1.length()!=str2.length())
    {
    	return false;
    }
	
  /* str1.toUpperCase();
   str2.toUpperCase();*/
   char[] str1_char=str1.toLowerCase().toCharArray();
   Arrays.sort(str1_char);
  
   
   char[] str2_char=str2.toLowerCase().toCharArray();
   Arrays.sort(str2_char);
    
    
    
    
    return Arrays.equals(str1_char, str2_char);
	}
	
	public static void main(String[] args) {
		
		//CHECK THE ANNAGRAM OF STRINGS
		
		System.out.println(checkAnnagram("BREAK", "baker"));
		
		
	}
}
