package collectionPractice;

import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        PriorityQueue p1 = new PriorityQueue<>(16, new ComparatorStringDemo1());

        p1.offer("A");
        p1.offer("Z");
        p1.offer("F");
        p1.offer("O");
        p1.offer("M");
        p1.offer("Y");


        //System.out.println(p1);

        while (!p1.isEmpty()) {
            System.out.println(p1.poll());
        }


    }

}
