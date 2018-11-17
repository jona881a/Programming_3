package Opgave_3;


public class BroekTester01 {
	public static void main(String[] args) {
		Broek b = new Broek(1,2);
		Broek c = new Broek(1,3);
		Broek d2 = c.plus(b);
		System.out.println(d2);
		System.out.println(d2.reciprok());
	}
}