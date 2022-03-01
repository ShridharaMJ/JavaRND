package com.java.pracice.interviewquestions;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TechnicalProgram1 {

    /*
     * Suppose we have a string as - String name =
     * “name:robert,age:28,jobtype:permanent,country:Canada”How to get the belwo
     * output ? The key “name” has value “robert” The key “age” has value “28” The
     * key “jobtype” has value “permanent” the key “country” has value “Canada”
     */

    @Test
    public void stringAsMap() {
        Map<String, String> map = new LinkedHashMap<>();

        String name = "name:robert,age:28,jobtype:permanent,country:Canada";

        String[] split = name.split(",");
        for (String string : split) {
            String[] values = string.split(":");
            map.put(values[0], values[1]);

        }

        System.out.println(map);
    }

}
