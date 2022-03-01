package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        int count = 0;
        Pattern p = Pattern.compile("[a-z A-Z 0-9]");
        Matcher m = p.matcher("adaAbdjkjhkjabaaaababababahahahahab9877589t9hiquy89u8324u@#$%^&*}{}");
        while (m.find()) {
            count++;

            System.out.println(m.start() + "----------------" + m.group());
        }

        System.out.println(count);
    }


}
