package Opgave_1;

import java.util.stream.IntStream;

public class Gennemsnit_sjov {
	public static double beregn(int[] tal) {
		return IntStream.of(tal).sum() / tal.length;
	}
}