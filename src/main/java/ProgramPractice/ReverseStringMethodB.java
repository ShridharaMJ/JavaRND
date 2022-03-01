package ProgramPractice;

public class ReverseStringMethodB {

    public static String reverStr(String str) {
        String reverse = "";
        char[] arrystr = str.toCharArray();
        for (int i = arrystr.length - 1; i >= 0; i--) {
            reverse = reverse + arrystr[i];
        }
        return reverse;
    }


    public static void main(String[] args) {

        System.out.println(reverStr("Shridhara"));
    }
}
