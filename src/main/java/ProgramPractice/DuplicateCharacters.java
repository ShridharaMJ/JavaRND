package ProgramPractice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateCharacters {

    public static int countChar(String str, char ch) {

        char[] str_ref = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str_ref.length; i++) {

            if (ch == str_ref[i]) {
                count++;
            }
        }
        return count;
    }

    public static void duplicatechars(String str) {
        str = str.replace(" ", "").toLowerCase();
        while (str.length() > 0) {
            char ch = str.charAt(0);
            int count = countChar(str, ch);
            if (count >= 2) {
                System.out.println(ch + " " + count);
            }
            str = str.replace("" + ch, "");
        }
    }

    public static void main(String[] args) {
        //duplicatechars("Shridhara M J");

        //Loic 2 using LinedHashMaP SMJ 01122018

        LinkedHashMap<Character, Integer> ref1 = DemoStringCharCount.getCharCount("ssshhhridhara");

        Iterator<Entry<Character, Integer>> itr1 = ref1.entrySet().iterator();
        while (itr1.hasNext()) {
            Entry<Character, Integer> temp = itr1.next();


            System.out.println(temp.getKey() + " " + temp.getValue());


        }


    }
}
