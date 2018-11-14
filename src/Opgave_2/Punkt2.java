package Opgave_2;
import java.awt.*;

@SuppressWarnings("serial")
public class Punkt2 extends Point implements Comparable<Punkt2> {

    //Fields x and y equals to Punkt1
    private int x,y;
    private Punkt1 p2;

    public Punkt2(int x, int y) {
        this.p2 = new Punkt1(x,y);
    }


    @Override
    public int compareTo(Punkt2 point) {
        return 0;
    }

    public String toString() {
        return p2.toString();
    }
}
