package collectionPractice;

import java.util.Comparator;

public class ComparatorStringDemo1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		String s1=o1.toString();
		String s2=(String)o2;
		//return s2.compareTo(s1); ReverseOrder
		return s2.compareTo(s1);
	}

}
