package Opgave_1;

public class Gennemsnit {

	public static double beregn(int[] tal) {

		// Before anything, we check to see if the int array is valid.
		// There might be problems if the array is empty, so in that case an
		// exception is thrown.
		if (tal.length == 0) {
			throw new IllegalArgumentException("The array can't be empty!");
		}

		// The variables are declared.
		// i is created here so that it can be used later outside of the for loop.
		// sum is going to be all the numbers in the array added up.
		double sum = 0;
		int i;

		// The sum of the array is calculated with a simple for loop.
		for (i = 0; i < tal.length; i++) {
			sum += tal[i];
		}

		// i is going to be equal to the amount of elements in the array.
		// Dividing the sum with the amount of elements in the array
		// gives us the average.
		return sum / i;

	}

}
