package no.hvl.dat100;

public class Rekker {

	public static void main(String[] args) {}
	
	public static int nFak(int n) {
		
		if (n <= 1) return 1;
		
		return nFak(n - 1)*n;
	}
	
	public static int fncci(int n) {
		
		if (n <= 2) return 1;
		
		return fncci(n - 2) + fncci(n - 1);
	}
	
	
	public static int tn(int n) {
		
		if (n <= 1) return 1;
		
		return tn(n - 1) + n;
	}
	
	
	public static int tnS(int n) {
		
		if (n < 1) return 0;
		
		if (n == 1) return 1;
		
		return 2*tnS(n - 1) - tnS(n - 2) + n;
	}
	

	}


