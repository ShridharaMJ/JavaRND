package ProgramPractice;

public class RemoveDuplicateElement {
    public static String removeDupCha(String str) {
        StringBuffer sb = new StringBuffer();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (sb.indexOf(str.valueOf(c)) != -1) {
                continue;
            } else
                sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(removeDupCha("ShridharaMj"));
    }
}
