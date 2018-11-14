package Opgave_2;
import java.awt.Point;

@SuppressWarnings("serial")
public class Punkt1 extends Point implements Comparable<Punkt1> {

    //Field x and y to use as point.
    private int x, y;

    public Punkt1(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Punkt1 point) {
        if(x != point.x) {
            return x - point.x;
        } else if(y != point.y) {
            return y - point.y;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
