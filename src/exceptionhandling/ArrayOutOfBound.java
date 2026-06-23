package exceptionhandling;

import java.lang.ArithmeticException;

public class ArrayOutOfBound {
    static void main(String[] args) {
        try {
            int num[] = {10, 28, 30};
            System.out.println(num[5]);
            System.out.println("Insidde try");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception handled");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Bound Exception handled");
        }
        System.out.println("Program end");
    }
}
