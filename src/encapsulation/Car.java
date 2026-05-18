package encapsulation;

public class Car {
    private String name;
    private int model;
    private double price;

    public Car(String name,int model,double price){
        this.name= name;
        this.model= model;
        this.price= price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getModel(){
        return model;
    }

    public double getPrice() {
        return price;
    }
}
