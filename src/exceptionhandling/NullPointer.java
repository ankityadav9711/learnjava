package exceptionhandling;

public class NullPointer {
    static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception handled");
        }
        System.out.println("Program end");
    }
}
