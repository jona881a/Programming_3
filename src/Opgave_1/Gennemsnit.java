package Opgave_1;

public class Gennemsnit {

	public static double beregn(int[] tal) {
		
		// Before anything, we check to see if the int array is valid
		if (tal.length == 0) {throw new IllegalArgumentException("The array can't be empty!");}
		
		// The variables are declared
		double sum = 0;
		int i;
		
		// The sum of the array is calculated
		for (i = 0; i < tal.length; i++) {
			sum = sum + tal[i];
		}

		// i is going to be equal to the amount of elements in the array
		return sum / i;
		
	}
	
}
