package conditions;
import java.util.*;
public class LeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("Leapyear");
        }else{
            System.out.println("Not a leapyear");
        }
    }
}
