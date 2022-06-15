package testngpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

    public static String test;

    @Test
    public void traslateanguage() {


    }

    @Test(dataProvider = "TestData")
    public void testMethod(String str) throws InterruptedException {
        System.out.println("Execution started for " + str);
        test = str;
        System.out.println("Changed static value" + test);
        Thread.sleep(30000);
        System.out.println("Execution ended for " + str);
    }

    @DataProvider(name = "TestData", parallel = true)
    public Object[][] dataProvideTestData() {


        return new Object[][]{{"Test"}, {"Test2"}, {"Test3"}, {"Test4"}};

    }
}
