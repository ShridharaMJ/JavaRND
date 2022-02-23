package collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put("TestName1", 98);
		m.put(980,"TestingValue");
		m.put(67.98, "Test");
		
		System.out.println(m);
		
				
		Set keysvalues = m.keySet();
		System.out.println(keysvalues);
		Collection values = m.values();
		System.out.println(values);
		
	Iterator itr = m.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
	}
	
}
