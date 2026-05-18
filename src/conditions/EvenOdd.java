package conditions;
import java.util.*;
public class EvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
            }
        else{
            System.out.println("Odd");
        }
    }
}
