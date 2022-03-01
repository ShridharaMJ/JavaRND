package demoInheritanc;

public class DemoMethods {


    public static void method1(String test) {
        System.out.println(test + "Executing the parameter");
    }

    public void method2(String x) {
        method1(x);
        System.out.println("Executing the method2()");
    }

    public static void main(String[] args) {

        DemoMethods dm = new DemoMethods();
        dm.method2("Testing");
    }
}
