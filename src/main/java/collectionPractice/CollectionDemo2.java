package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add("A");
        l.add("H");
        l.add("T");
        l.add("Q");
        l.add("L");
        l.add("S");
        l.add("S");

        //System.out.println(l);
		
	/*	Collections.sort(l, new ComparatorStringDemo1());
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, "Q", new ComparatorStringDemo1()));
		*/

        Comparator ci = Collections.reverseOrder(new ComparatorStringDemo1());

        Collections.sort(l, ci);

        System.out.println(l);

    }

}
