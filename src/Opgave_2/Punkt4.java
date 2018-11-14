package Opgave_2;

import java.awt.*;

@SuppressWarnings("serial")
public class Punkt4 extends Point implements Comparable<Punkt4> {

    //Field x and y to use as point.
    private int x, y;

    public Punkt4(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Punkt4 o) {
        return 0;
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }
}
