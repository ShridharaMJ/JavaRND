package collectionPractice;

import java.util.Stack;

public class StacDemo1 {
    public static void main(String[] args) {


        Stack st = new Stack<>();
        st.push("A");
        st.push("T");
        st.push("C");
        st.push("D");

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st);

        System.out.println(st.pop());

        System.out.println(st);

        System.out.println(st.search("A"));

        System.out.println(st.search("j"));
    }
}
