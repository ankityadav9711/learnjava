package conditions;
import java.util.*;
public class LargestOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("Largest");
        }
        else {
            System.out.println("Smallest");

        }
    }
}
