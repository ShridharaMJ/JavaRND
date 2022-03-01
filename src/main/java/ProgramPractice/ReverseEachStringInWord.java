package ProgramPractice;

public class ReverseEachStringInWord {
    public static void reverseWord(String str) {
        String temp_string;
        String[] str_ref = str.split("\\s");
        for (String string : str_ref) {
            temp_string = "";
            char[] string1 = string.toCharArray();
            for (int i = string1.length - 1; i >= 0; i--) {
                temp_string = temp_string + string1[i];

            }
            System.out.println(temp_string);

        }
    }

    public static void main(String[] args) {
        reverseWord("This is testing purpose");
    }
}
