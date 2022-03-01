package ProgramPractice;

public class StringUtility {

    public static void extractDigitsFromString(String str) {
        String str_temp = "";
        String str1 = str.replaceAll("\\D", "");
        //System.out.println(str1);
        String[] str2 = str.split("\\d");
        for (String string : str2) {
            str_temp = str_temp + string;
        }

        System.out.println(str_temp + " " + str1);
    }

    public static void main(String[] args) {
        extractDigitsFromString("hg8938kafjhskjashfi98u8fasnfa9f8af98ucgyY83");

        //Logic2


    }
}
