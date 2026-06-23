package exceptionhandling;

import java.lang.ArithmeticException;

public class ToString {
    static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
