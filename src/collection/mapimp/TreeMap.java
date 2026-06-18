package collection.mapimp;

import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMap {
    static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("Employee ID",102);
        map.put("Employee Phone no",975556565);
        map.put("Employee Salary",100000);
        map.put("Employee Experience",4);
        map.put("Employee Age",25);
        map.size();

        System.out.println(map);
        System.out.println(map.size());

        map.values();
        System.out.println(map.values());

        map.keySet();
        System.out.println( map.keySet());

        //  map.clear();
        // System.out.println( map);
        map.hashCode();
        System.out.println(map.hashCode());

        map.get("Employee ID");
        System.out.println( map.get("Employee ID"));

        map.isEmpty();
        System.out.println(map.isEmpty());
        map.remove("Employee Phone no");
        System.out.println(map.remove("Employee Phone no"));

        map.containsKey("Employee ID");
        System.out.println( map.containsKey("Employee ID"));


    }
}
