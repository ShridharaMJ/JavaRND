package ProgramPractice;

public class CountOccuranceOfString {

    public static int getCharCount(String str, char c) {
        int count = 0;
        char[] str_char = str.toLowerCase().toCharArray();
        for (int i = 0; i < str_char.length; i++) {
            if (c == str_char[i]) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {

        int cc = getCharCount("Edenred", 'n');
        System.out.println(cc);

    }
}
