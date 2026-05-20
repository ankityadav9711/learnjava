package inheritance;

public class Study {
    static void main(String[] args) {
        Pen pen1= new Pen();
        pen1.color="blue";
        pen1.type="gel";
        Pen pen2 = new Pen();
        pen2.color="black";
        pen2.type="ball point";
        pen1.color();
        pen1.type();
        pen2.color();
        pen2.type();

    }
}
