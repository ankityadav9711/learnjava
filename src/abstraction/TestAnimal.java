package abstraction;

public class TestAnimal {
    static void main(String[] args) {
     Animal animal=new MyClass();
     animal.sound();
     animal.breathe();

     MyClass myClass=new MyClass();
     myClass.sound();
     myClass.breathe();
     myClass.run();
    }
}
