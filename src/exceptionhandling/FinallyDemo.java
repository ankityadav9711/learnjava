package exceptionhandling;

import java.lang.ArithmeticException;

public class FinallyDemo {
    static void main(String[] args) {
        int a = 10 ;
        int b = 0;
        try{
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Program runs successfully");
        }
        System.out.println("Program end");
    }
}
