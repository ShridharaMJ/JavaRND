package ProgramPractice;

public class Palamdrome {


    public static void isPalamdrome(String str) {

        String rerstr = ReverseStringUsingVariable.reverseString1(str);
        if (str.equals(rerstr)) {
            System.out.println(str + " is palandrome");
        } else {
            System.out.println(str + " Is not palandrome");
        }
    }


    public static void main(String[] args) {
        Palamdrome.isPalamdrome("malayalam");
    }
}
