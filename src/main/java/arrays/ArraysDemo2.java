package arrays;

import java.util.Arrays;

public class ArraysDemo2 {


    public static void main(String[] args) {


        String[] s1 = new String[7];
        s1[0] = "YGU";
        s1[1] = "UYGY";
        s1[2] = "IHU";
        s1[3] = "TEW";
        s1[4] = "POL";
        s1[5] = "MKL";
        s1[6] = "QQP";
		
		/*for (String string : s1) {
			System.out.println(string);
		}*/

        Arrays.sort(s1);

        for (String string : s1) {
            System.out.println(string);
        }


    }


}
