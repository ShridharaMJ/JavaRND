package testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class postTestClass extends setUpClass
{
    @AfterTest
    public void tearDownAfterTest(){
        System.out.println("Executing After Test");
    }
    @AfterMethod
    public void tearDownAfterMethod(){
        System.out.println("Executing After Method");
    }


}
