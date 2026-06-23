import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterr a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial*i;
        }
        System.out.println("Factoeial of "+ num+" = "+ factorial);
    }
}
