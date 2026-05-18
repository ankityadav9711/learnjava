package encapsulation;

public class Student {
    private String name;
    private int rollNumber;

    private Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
