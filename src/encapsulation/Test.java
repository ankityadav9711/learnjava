package encapsulation;

public class Test {
    static void main(String[] args) {
        Student s = new Student();
        s.setName("Ankit Yadav");
        s.setRollNumber(23);

        System.out.println("Name is...."+s.getName());
        System.out.println("RollNumber is...."+s.getRollNumber());
    }
}
