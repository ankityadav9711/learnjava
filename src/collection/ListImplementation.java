package collection;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    static void main(String[] args) {
        //list creation
        List<String> lst = new ArrayList<>();

        //add objects in the list
        lst.add("Ankit");
        lst.add("Mayank");
        lst.add("Sourav");
        lst.add("Dhruv");
        lst.add("Prince");
        lst.add("Vishal");
        lst.add("Aditya");
        lst.add("Vijendra");
        lst.add("Mayank");
        lst.add("Prince");
        //lst.remove(4);
        System.out.println(lst);
        lst.size();
        System.out.println(lst.size());
        lst.set(6,"Rohit");
        System.out.println(lst);
        lst.contains("Mayank");
        System.out.println(lst.contains("Ram"));
        lst.add(10,"Vijay");
        System.out.println(lst);
        System.out.println(lst.get(1));
        lst.clear();
         System.out.println(lst);
        System.out.println(lst.isEmpty());
    }
}
