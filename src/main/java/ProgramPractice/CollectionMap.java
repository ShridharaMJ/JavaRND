package ProgramPractice;

import java.util.HashMap;

public class CollectionMap {

    public static void main(String[] args) {

        HashMap m = new HashMap<>();
        m.put("Chiru", 2999);
        m.put("Bala", 897);
        m.put("Venki", 98798);
        m.put("Naga", 9890);
        m.put("SMJ", 909909);
        System.out.println(m);
        System.out.println(m.put("Chiru", 10000));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());


    }
}
