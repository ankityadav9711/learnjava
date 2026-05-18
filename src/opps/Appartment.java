package opps;

public class Appartment extends Property{
    private int floor;
    private boolean hasBalcony;

    public Appartment(String location, double price, int size,int floor,boolean hasBalcony) {
        super(location, price, size);
        this.floor=floor;
        this.hasBalcony=hasBalcony;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of floors are:"+floor);
        System.out.println("Has balcony:"+hasBalcony);
    }
}
