package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Rekker {

	public static void main(String[] args) {
		
		int n, t = 0;
		do {
			if (t == 5) {
				System.out.println();
				t = 0;
			}
			n = parseInt(showInputDialog(null, "n: "));
			System.out.print("+" + tn(n) + " = " + tnS(n) + "\n");
			t++;
		} while (n != 0);
	}
	
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


