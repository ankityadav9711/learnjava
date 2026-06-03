package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListImp {
    static void main(String[] args) {
        List<Integer> lst3=new ArrayList<>();
        lst3.add(23);
        lst3.add(56);
        lst3.add(59);
        lst3.add(53);
        lst3.add(1);
        lst3.add(9);

        List<Integer> lst4=new ArrayList<>();
        lst4.add(55);
        lst4.add(45);
        lst4.add(77);
        lst4.add(23);
        lst4.add(11);
        lst4.add(78);
        lst4.addAll(lst3);
        System.out.println(lst4);

        System.out.println(lst3);
        Collections.sort(lst3);
        System.out.println(lst3);
        lst3.remove(4);
        System.out.println(lst3);
       // lst3.remove(1);

        System.out.println(lst3);

      //  lst3.clear();
       // System.out.println(lst3);
        lst3.hashCode();
        System.out.println(lst3.hashCode());
        System.out.println(lst3.size());
        lst3.set(3,60);
        System.out.println(lst3);
        System.out.println(lst3.isEmpty());

    }
}
