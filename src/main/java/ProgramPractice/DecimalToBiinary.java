package ProgramPractice;

public class DecimalToBiinary {

    public static void DTB(int num) {
        int i = 0;
        int[] a = new int[25];
        while (num > 0) {


            a[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {

            System.out.print(a[j]);
        }
    }

    public static void main(String[] args) {
        DTB(357);
    }

}
