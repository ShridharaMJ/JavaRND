package collectionPractice;

import java.util.HashMap;

public class DemoMap {

    public static void main(String[] args) {
        char current_char;
        String s1 = "malayalam";
        char[] str_array = s1.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str_array.length; i++) {
            current_char = str_array[i];
            if (!hm.containsKey(current_char)) {
                hm.put(current_char, 1);

            } else {

                hm.put(current_char, hm.get(current_char) + 1);


            }

        }


        System.out.println(hm);
    }

}
