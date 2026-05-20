package inheritance;

public class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("pen writes");
    }
    public void color(){
        System.out.println(this.color);
    }

    public void type() {
        System.out.println(this.type);
    }
}
