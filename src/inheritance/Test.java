package inheritance;

public class Test {
    static void main(String[] args) {
        House house=new House("Ghaziabad",250000,
                300,3,true);

       house.displayDetails();


    Appartment appartment = new Appartment("Noida", 400000, 1000, 4, true);
  {
       appartment.displayDetails();
        }
        Office office = new Office("Ghaziabad", 300000, 400, 4, "Careercraft");
        {
            office.displayDetails();
        }
    }
}
