package Opgave_2;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        Punkt2[] ps = new Punkt2[8];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Punkt2(i, i);
        }
        System.out.println(Arrays.toString(ps));
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

