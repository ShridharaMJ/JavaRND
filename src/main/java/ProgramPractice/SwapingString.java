package ProgramPractice;

public class SwapingString {


    public static String swapStringWithoutUsingTemPVariable(String str) {
        String strNew = "";
        char[] str_array = str.toCharArray();

        for (int i = str_array.length - 1; i >= 0; i--) {

            strNew = strNew + str_array[i];
        }

        return strNew;

    }


    public static void main(String[] args) {
        System.out.println(swapStringWithoutUsingTemPVariable("Shridhara M J"));
    }
}
