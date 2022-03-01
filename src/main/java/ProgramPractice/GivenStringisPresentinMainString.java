package ProgramPractice;

public class GivenStringisPresentinMainString {

    public static boolean checkSubString(String str, String str_search) {

        str = str.replaceAll(" ", "");
        str = str.toLowerCase();
        str_search = str_search.toLowerCase();
        if (str.indexOf(str_search) != -1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean xxxx = checkSubString("This is for testing purpose", "purposes");
        System.out.println(xxxx);
    }

}
