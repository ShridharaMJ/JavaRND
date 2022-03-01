package arrays;

import java.util.Arrays;

public class ArraysDemo1 {

    public static void main(String[] args) {


        int[] i = new int[10];
        i[0] = 6778;
        i[1] = 4545;
        i[2] = 9098;
        i[3] = 4535;
        i[4] = 4536;
        i[5] = 3456;
        i[6] = 1234;

        Arrays.sort(i);

        for (int j : i) {
            System.out.print(" " + j);
        }


    }

}
