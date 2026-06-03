package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImp {
    static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(23);
        hashset.add(43);
        hashset.add(67);
        hashset.add(45);
        System.out.println(hashset);

       // hashset.clear();
      //  System.out.println(hashset);
        Iterator<Integer>it= hashset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
            hashset.clear();
            System.out.println(hashset);

    }
}
