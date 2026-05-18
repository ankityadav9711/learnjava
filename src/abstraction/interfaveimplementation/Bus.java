package abstraction.interfaveimplementation;

public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bus start");
    }

    @Override
    public void speed() {
        System.out.println("Bus speed 60km/h");

    }

    @Override
    public void stop() {
        System.out.println("Bus stop");

    }

    @Override
    public void fuelCapacity() {
        System.out.println("Bus store 200 litre");

    }

    @Override
    public void model() {
        System.out.println("Bus model 2026");

    }
}
