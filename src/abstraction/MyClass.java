package abstraction;

public class MyClass extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    void run() {
        System.out.println("Animal is running");
    }
}
