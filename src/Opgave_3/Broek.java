package Opgave_3;


/* Skeleton for the exercise */

public class Broek {
	
	// The field declarations
	int t;
	int n;
	
	// The denominator is checked, if it is 0 an exception is thrown
	// The constructor sets t and n to the inputs
	// The t and n is the simplified
	public Broek(int t, int n){
		if (n == 0) {
			throw new IllegalArgumentException("Nævneren må ikke være 0");
		}
		
		this.t = t;
		this.n = n;
		simplificer();
		
	}
	
	// This method finds the greatest common denominator
	public int findSFN(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findSFN(b, a % b);
		}
	}
	
	// This method simplifies the t and n by using the greatest common denominator
	public void simplificer() {
		int SFN = findSFN(t, n);
		t /= SFN;
		n /= SFN;
	}
	
	
	// This method finds the t
	public int findTæller() {
		return t;
	}
	
	// This method finds the n
	public int findNævner() {
		return n;
	}
	
	// The add method
	public Broek plus(Broek f) {
		t = (this.t * f.findNævner()) + (this.n * f.findTæller());
		n = this.n * f.findNævner();
		return new Broek(t, n);
		
	}
	
	// The subtract method
	public Broek minus(Broek f) {
		t = (this.t * f.findNævner()) - (this.n * f.findTæller());
		n = this.n * f.findNævner();
		return new Broek(t, n);
		
	}
	
	// The multiply method
	public Broek gange(Broek f) {
		t = this.t * f.findTæller();
		n = this.n * f.findNævner();
		return new Broek(t, n);
		
	}
	
	// The reciprocal method
	public Broek reciprok() {
		return new Broek(n, t);
		
	}
	
	// The method that returns t and n as a string
	public String toString() {
		return t + "/" + n;
	}
	
}