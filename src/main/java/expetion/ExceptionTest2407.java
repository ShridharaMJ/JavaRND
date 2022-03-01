package expetion;

public class ExceptionTest2407 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        doStuff();

    }

    private static void doStuff() throws InterruptedException {
        // TODO Auto-generated method stub
        doMoreStuff();
    }

    private static void doMoreStuff() throws InterruptedException {
        // TODO Auto-generated method stub
        Thread.sleep(5000);
        System.out.println("Testing purpose");
    }
}
