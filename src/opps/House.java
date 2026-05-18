package opps;

public class House extends Property{
    private int room;
    private boolean hasGardern;
    public House(String location, double price, int size,int room,boolean hasGardern) {
        super(location, price, size);
        this.room=room;
        this.hasGardern=hasGardern;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of Rooms:"+room);
        System.out.println("HasGardern:"+hasGardern);
    }

}
