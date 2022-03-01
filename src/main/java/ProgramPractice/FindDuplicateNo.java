package ProgramPractice;

public class FindDuplicateNo {
    public static int duplicteNo(int[] a1) {
        int count = a1.length;
        int temp = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 1; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    temp = a1[i];
                }

            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 3};
        int testdata = duplicteNo(array);
        System.out.println(testdata);
    }
}
