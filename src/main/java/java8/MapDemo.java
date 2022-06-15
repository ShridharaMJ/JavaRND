package java8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
public static Map<String, Map<String, String>> map1=null;
   @Test()
   public void testCases() {

        map1 = new LinkedHashMap<>();
       for (int j = 0; j <= 10; j++) {
           Map<String, String> innerMap = new LinkedHashMap<>();
           for (int i = 0; i < 5; i++) {


               String key = "TC" + j+"key" + i;
               String value = "TC" + j + "value" + i;
               innerMap.put(key, value);

           }
           map1.put("TC"+j, innerMap);


       }

        System.out.println(map1);
   }

}
