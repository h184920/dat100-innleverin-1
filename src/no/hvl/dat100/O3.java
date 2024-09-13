package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class O3 {
	
	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv in en heltallsverdi for n; "));
		
		showMessageDialog(null, "" + n + "! = " + nFak(n));
	}
	
	
	public static int nFak(int n) {
		
		if (n <= 1) return 1;
		
		return nFak(n - 1)*n;
	}
}
	

