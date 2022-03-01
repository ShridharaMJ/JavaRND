package thread;

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.setPriority(9);
        t.start();

        //t.run();

        for (int i = 0; i < 5; i++) {
            System.out.println("...........Main Thread...........");
        }

        //System.out.println("Executing main()");

    }

}
