package collection.mapimp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(54);
        list.add(76);
        list.add(87);
        for (Integer integer : list)
        {
            System.out.println(list);
            list.add(99);
            list.add(12);
        }
    }
}