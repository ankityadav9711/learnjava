package conditions;
import java.util.*;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number..");
        int a = sc.nextInt();

        System.out.println("Enter second number..");
        int b = sc.nextInt();

        System.out.println("Enter operator (+,-,*,/):");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Addition = "+(a+b));
        } else if (op == '-') {
            System.out.println("Subtraction = "+(a-b));
        } else if (op == '*') {
            System.out.println("Multiplication = "+(a*b));
        } else if (op == '/') {
            System.out.println("Division = "+(a/b));
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
