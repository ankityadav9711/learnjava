package encapsulation;

public class Vehicle {
    static void main(String[] args) {
        Car car = new Car("Verna", 2026, 2700000);
        car.getName();
        car.getModel();
        car.getPrice();
        System.out.println("Car name is...."+car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
    }
}
