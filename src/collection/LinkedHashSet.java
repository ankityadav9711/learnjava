package collection;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    static void main(String[] args) {
        Set<Integer> lhs = new java.util.LinkedHashSet<>();
        lhs.add(56);
        lhs.add(45);
        lhs.add(97);
        lhs.add(12);
        System.out.println(lhs);

        Iterator<Integer>it= lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        lhs.hashCode();
        System.out.println(lhs.hashCode());
        lhs.size();
        System.out.println(lhs.size());

    }
}
