package collectionPractice;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		PriorityQueue p1=new PriorityQueue<>();
		for (int i = 0; i <=10; i++) {
		
			p1.offer(i);
			
		}
		
		System.out.print(p1);
		
		System.out.println(p1.poll());
		System.out.println(p1.peek());
		System.out.println(p1.remove());
		System.out.println(p1.element());
	
	}
	
}
