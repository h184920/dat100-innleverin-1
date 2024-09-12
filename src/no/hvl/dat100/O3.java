package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv in en heltallsverdi for n; "));
		showMessageDialog(null, "" + n + "! = " + fakN(n));
		
	}
	
	public static int fakN(int n) {
		if (n <= 1) {
			return n;
		}
		return n*fakN(n - 1);
	}

}
