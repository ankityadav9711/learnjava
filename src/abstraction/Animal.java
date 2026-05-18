package abstraction;

public abstract class Animal {
    public void breathe()
    {
        System.out.println("Animal breathing");
    }
    public void eating()
    {
        System.out.println("Animal is eating");
    }
    abstract void sound();
    abstract void run();
}
