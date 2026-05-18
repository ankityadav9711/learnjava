public class SwappingWithOutThirdVariable {
    static void main(String[] args) {
        int a=30,b=50;

        a=a+b;// a=80

        b=a-b; // b=80-50=30
        a=a-b;  // a=80-30=50

        System.out.println("a is --> "+a);
        System.out.println("b is --> "+b);
    }
}
