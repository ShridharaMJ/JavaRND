package ProgramPractice;

public class ReverseStringUsingVariable {


    public static String reverseString1(String str) {

        char[] rev = str.toCharArray();
        String reverse = "";


        for (int i = rev.length - 1; i >= 0; i--) {
            reverse = reverse + rev[i];
        }


        ;
        return reverse;
    }


    public static void main(String[] args) {

        System.out.println(ReverseStringUsingVariable.reverseString1("TestingPurpose"));


    }
}
