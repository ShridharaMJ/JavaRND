package collectionPractice;

import java.util.TreeSet;

public class ReverseOfAlpOrder {
    public static void main(String[] args) {


        //TreeSet ts=new TreeSet<>(new ComparatorStringDemo1());

        ComparatorLenghtDemo ld = new ComparatorLenghtDemo();
        TreeSet ts = new TreeSet(ld);


        ts.add("Nandini");
        ts.add("Hansika");
        ts.add("Vijay");
        ts.add("Shridhara");
        ts.add("KanyaKumari");
        ts.add("Jaya");


        System.out.println(ts);
    }
}
