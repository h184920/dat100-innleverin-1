package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class O2 {
	
	
	public static void main(String[] args) {
		
		final int[] trinn = {208050, 292850, 670000, 937900, 1350000};
		final double[] prosenter = {0.0, 1.7, 9.0, 13.6, 16.6, 17.6};
		
		
		double inntekt = hentBrutto("Skriv inn inntekt: ");
		
		if (inntekt < 0) {
			showMessageDialog(null, "Ikke skriv inn negative verdier er du snill");
		}
	
		double prosent = prosenter[finnTrinnDex(inntekt, trinn)];

		showMessageDialog(null, 
			"Din trinnskatt\n" + (int)(inntekt*prosent/100) + " NOK");
		}
		

	public static double hentBrutto(String hjelpetekst) {
		return parseDouble(showInputDialog(null, hjelpetekst));
	}
	
	public static int finnTrinnDex(double inntekt, int[] grenser) {
		int i;
		for (i=1; i<grenser.length; i++) 
			{if (inntekt <= grenser[i]) return i - 1;}
		return i;
		
	}

}

















