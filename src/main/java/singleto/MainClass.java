package singleto;

public class MainClass {


    public static void main(String[] args) {

        //SingleTon ref1=new SingleTon();

        SingleTon ref1 = SingleTon.getInstant();
        System.out.println(ref1);
        SingleTon ref2 = SingleTon.getInstant();
        System.out.println(ref2);
    }
}
