package exceptionhandling;

import java.lang.ArithmeticException;

public class PrintStackTrace {
    static void main(String[] args) {
        try {
            int result = 10/0;
        }
        catch (ArithmeticException e){
     e.printStackTrace();
        }
    }
}
