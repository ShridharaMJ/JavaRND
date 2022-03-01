package ProgramPraactice1;

public class B extends A {
    String str;

    public B(int x, String str) {
        super(x);
        this.str = str;
    }

    void test12() {
        System.out.println("Test1 of B");

    }


    public static void main(String[] args) {
		/*B bref=new B(100,"TestUser");
		System.out.println(bref.str+" "+bref.x);*/

        A Aref = new B(1000, "TestName");

        System.out.println(Aref.x);

        B bref = (B) Aref;

        System.out.println(bref.str + " " + bref.x);


    }
}
