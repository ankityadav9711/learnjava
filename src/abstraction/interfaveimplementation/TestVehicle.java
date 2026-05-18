package abstraction.interfaveimplementation;

public class TestVehicle {
    static void main(String[] args) {
        Car car= new Car();
        Bike bike=new Bike();
        Bus bus=new Bus();
        System.out.println("Car Detils......................");
        car.speed();
        car.start();
        car.stop();
        car.fuelCapacity();
        car.model();
        System.out.println("Bike Detils......................");
        bike.start();
        bike.speed();
        bike.fuelCapacity();
        bike.model();
        bike.stop();
        System.out.println("Bus Details..................");
        bus.start();
        bus.speed();
        bus.fuelCapacity();
        bus.model();
        bus.stop();
    }
}
