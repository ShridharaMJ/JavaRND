package testngpractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class setUpClass {

    @BeforeTest
    public void setUpBefore(){
        System.out.println("Executing BeforeTest.");
            }

    @BeforeMethod
    public void setupBeforeMethod(){
        System.out.println("Executing BeforeMethod.");
    }
}
