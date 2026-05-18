package opps;

public class Office extends Property{
    private int numberOfTeammember;
    private String name;
    public Office(String location,double price,int size,int numberOfTeammember,String name){
        super(location,price,size);
        this.numberOfTeammember=numberOfTeammember;
        this.name=name;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("number of team member:"+numberOfTeammember);
        System.out.println("office name:"+name);
    }
}
