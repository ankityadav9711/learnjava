package opps;

public class Main {
    static void main(String[] args) {
        Vehicle vehicle = new Bike();
        Vehicle vehicle1=new Car();
        Vehicle vehicle2=new Bus();
        vehicle.sound();
        vehicle1.sound();
        vehicle2.sound();
    }
}
