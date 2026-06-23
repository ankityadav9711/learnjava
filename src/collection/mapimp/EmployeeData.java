package collection.mapimp;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class EmployeeData {
    static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Employee Name","Ankit");
        map.put("Employee Age","24");
        map.put("Employee Salary","100000");
        map.put("Employee Role","Java Developer");
        map.put("Employee Address","Ghaziabad");
        // iterator using lambda
        map.forEach((Key,Value)->
        {
            System.out.println(Key+"="+Value);
        });
        //j2ee
        for (String key : map.keySet()){
            System.out.println(key);
        }
        for (String value : map.values()){
            System.out.println(value);
        }

    }
}
