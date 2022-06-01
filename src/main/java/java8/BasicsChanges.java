package java8;

import demo.Something;
import interfaceDemo.Converter;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class BasicsChanges {

    private static List<String> list;

    @Test
    public void testSort() {

        list = Arrays.asList("peter", "anna", "mike", "xennnia");
        Collections.sort(list, (a, b) -> b.compareTo(a));
        System.out.println(list);
    }


    @Test
    public void methodReferenceTest() {

       /* Converter<Integer,String> converter=(form) -> Integer.valueOf(form);
        Integer num = converter.conver("09890");
        System.out.println(num);
        */

        Something something = new Something();
        Converter<String, String> starthWith = something::starthWith;
        System.out.println(starthWith.conver("Testing"));


    }

    @Test
    public void optionTest() {

        Optional<String> option = Optional.of("Testing");
        String str = option.get();
        boolean flag = option.isEmpty();
        option.orElse("Engineer");

        System.out.println(str);
        System.out.println(flag);

    }

    @Test
    public void test() {

        ArrayList<String> list = new ArrayList<>();

        UUID uuid = UUID.randomUUID();
        for (int i = 0; i < 100000; i++) {
            list.add(String.valueOf(uuid));
        }

        // This is taking 109 ms
       /* Collections.sort(list);
        System.out.println(list.size());*/

        // Stream is 108 ms
        // list.stream().sorted().count();

        // parallel stream taking 20 ms
        list.parallelStream().sorted().count();
    }

    @Test
    public void stringChanges(){
        String join = String.join("", "Test2", "Test3");
        System.out.println(join);
    }
 @Test
    public void filesChanges() throws IOException {
     Path path= Path.of("/home/lenovo/IdeaProjects");
     try(Stream<Path> stream=Files.walk(path,1)){
        stream.forEach(s-> System.out.println(s.getFileName()));
     }
 }


}
