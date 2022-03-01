package ProgramPractice;

public class FirstNonRepeatCharacter {

    public static char nonRepeatChar(String str) {

        str = str.toLowerCase().replace(" ", "");
        while (str.length() > 0) {
            char ch = str.charAt(0);
            int count = DuplicateCharacters.countChar(str, ch);
            if (!(count >= 2)) {
                return ch;
            }
            str = str.replace("" + ch, "");
        }


        return ' ';

    }

    public static void main(String[] args) {
        char ch = nonRepeatChar("geeksforgeeks");
        System.out.println("First Non repeat character is " + ch);
    }
}
