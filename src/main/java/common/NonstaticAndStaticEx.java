package common;

public class NonstaticAndStaticEx {
int x=20;
static int y=30;
public static void main(String[] args) {
	NonstaticAndStaticEx t1 = new NonstaticAndStaticEx();
	t1.x=300;
	t1.y=400;
	System.out.println(t1.x+"---------"+t1.y);
	NonstaticAndStaticEx t2 = new NonstaticAndStaticEx();
	System.out.println(t2.x+"---------"+t2.y);
}
}
