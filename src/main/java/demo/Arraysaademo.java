package demo;

public class Arraysaademo {
    public static void main(String[] args) {
        int balu;
        int[] a = new int[10];
        a[0] = 10;
        a[1] = 'a';
        byte b = 10;
        a[2] = b;
        short s = 13;
        a[3] = s;
        a[4] = 10001;

        for (int i : a) {
            System.out.println(i);
        }


    }


}
