package collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ankit");
        set.add("Mayank");
        set.add("Sourav");
        set.add("Dhruv");
        set.add("Prince");
        set.add("Vishal");
        set.add("Aditya");
        set.add("Vijendra");
        set.add("Mayank");
        set.remove("Vishal");
        System.out.println(set);
        System.out.println(set.size());

        System.out.println(set);
        set.contains("Mayank");
        System.out.println(set.contains("Ram"));
        set.add("Vijay");
        set.clear();
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

        set.remove("Vishal");
    }
}
