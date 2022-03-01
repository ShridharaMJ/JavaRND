package ProgramPractice;

import java.util.LinkedHashMap;

public class DemoStringCharCount {

    public static LinkedHashMap<Character, Integer> getCharCount(String s1) {

        char[] str_char = s1.toCharArray();

        LinkedHashMap<Character, Integer> hmref = new LinkedHashMap<Character, Integer>();


        for (int i = 0; i < str_char.length; i++) {
            if (!hmref.containsKey(str_char[i])) {
                hmref.put(str_char[i], 1);

            } else {
                hmref.put(str_char[i], hmref.get(str_char[i]) + 1);
            }
        }
        return hmref;


    }

    public static void main(String[] args) {
        System.out.println(getCharCount("GIT  Testing Purpose"));
    }
}
