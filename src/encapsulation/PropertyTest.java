package encapsulation;

public class PropertyTest {
    static void main(String[] args) {
        Property p=new Property("Ghaziabad",500,500000);
        p.getLocation();
        p.getSize();
        p.getPrice();
        System.out.println("Location is.... "+p.getLocation());
        System.out.println(p.getSize());
        System.out.println(p.getPrice());
    }
}
