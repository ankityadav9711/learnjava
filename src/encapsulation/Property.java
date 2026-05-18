package encapsulation;

public class Property {
    private String location;
    private int size;
    private double price;

    public Property(String location, int size, double price) {
        this.location = location;
        this.size = size;
        this.price = price;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;


    }
}
