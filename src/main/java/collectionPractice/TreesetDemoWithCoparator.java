package collectionPractice;

import java.util.TreeSet;

public class TreesetDemoWithCoparator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ComparatorDemo c = new ComparatorDemo();
        TreeSet ts = new TreeSet<>(c);
        ts.add(100);

        ts.add(89);

        ts.add(8);

        ts.add(34);

        System.out.println(ts);


    }

}
