package constructor;

public class DemoCons {


    public DemoCons() {
        // TODO Auto-generated constructor stub
        this(100);
        System.out.println("Executing the Default constructor");
    }

    public DemoCons(int i) {
        this("Demo");
        System.out.println("Executing the  parameterized constructor with value " + i);
    }

    public DemoCons(String str) {
        System.out.println("Executing the parameterized string constructor with value " + str);
    }

    public static void main(String[] args) {
        DemoCons cn = new DemoCons();
    }


}
