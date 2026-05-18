package abstraction.interfaveimplementation;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void speed() {
        System.out.println("Bike speed 95");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");

    }

    @Override
    public void fuelCapacity() {
        System.out.println("Fuel capacity 10 litre");

    }

    @Override
    public void model() {
        System.out.println("Bike model 2026");

    }
}
