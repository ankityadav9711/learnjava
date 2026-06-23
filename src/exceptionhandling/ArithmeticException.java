package exceptionhandling;

public class ArithmeticException {
    static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int result = a/b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("cannot divide by zero");
        }
        System.out.println("Program end");
    }
}
