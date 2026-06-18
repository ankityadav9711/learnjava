package collection.mapimp;

import java.util.ArrayList;
import java.util.List;

public class FailFast {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(34);
        list.add(99);
        for(Integer integer: list) {
            System.out.println(list);
list.add(67);
        }
    }
}
