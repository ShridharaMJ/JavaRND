/**
 * 
 */
package  inheritance;

/**
 * @author RIL
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1=new Parent();
		p1.methodOne();
		//p1.methodTwo(); C.E
		
		Child c1=new Child();
		c1.methodOne();
		c1.methodTwo();
		
		Parent p2 = new Child();
		p2.methodOne();
		//p2.methodtwo(); C.E
		
		//Child c11= new Parent(); C.E

	}

}
