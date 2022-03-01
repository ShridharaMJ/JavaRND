package ProgramPractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RemoveViwels {

    public static String removeVowels(String str) {
        String s2 = str.toLowerCase();

        char[] ch = s2.toCharArray();
        String vowels = "";

        for (char c : ch) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                vowels = vowels + c;
            }
        }
        return vowels;

    }

    public static void main(String[] args) {
        //System.out.println(removeVowels("hjaAQOIPQPOPQOJAKLAJLaaiooajiojweoijenjnvbmvuhbfavbhjbhjb"));
        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
