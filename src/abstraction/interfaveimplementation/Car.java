package abstraction.interfaveimplementation;

public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("Car is Starting.......");
    }

    @Override
    public void speed() {
        System.out.println("Car running with 110k/hr");

    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    public void fuelCapacity() {
        System.out.println("car contain 30 litre");

    }

    @Override
    public void model() {
        System.out.println("car model is 2026");

    }
}
