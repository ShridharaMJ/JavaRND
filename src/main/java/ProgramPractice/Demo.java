package ProgramPractice;

import java.util.Scanner;

public class Demo {

    String name;
    int marks;
    int roolno;

    public Demo(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
        ;
    }

    public Demo(int marks, String name) {
        // TODO Auto-generated constructor stub
        this(name);
        this.marks = marks;
    }

    public static void main(String[] args) {
		/*Demo d1=new Demo("TestName");
		System.out.println("Name="+d1.name);
		Demo d2=new Demo(100,"TestName1");
		System.out.println("Name= "+d2.name+ " Marks= "+d2.marks);
		*/


        //SMJ 12021018


        System.out.println("Enter the String");
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        System.out.println("Enter the search Indesx");
        int i = scr.nextInt();

        int i1 = (int) str.charAt(i);
        //System.out.println(i1);

        if (i1 >= 65 && i1 <= 90) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
