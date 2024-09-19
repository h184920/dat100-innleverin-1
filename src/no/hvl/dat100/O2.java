package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class O2 {
	
	
	public static void main(String[] args) {
		
		final int[] grenser = {0, 208050, 292850, 670000, 937900, 1350000};
		final double[] prosenter = {0.0, 1.7, 4.0, 13.6, 16.6, 17.6};
		
		
		double inntekt = hentBrutto("Skriv inn inntekt: ");
		
		if (inntekt < 0) {
			showMessageDialog(null, "Ikke skriv inn negative verdier er du snill");
		}
	
		showMessageDialog(null, 
		"Din trinnskatt\n" 
		+ beregnSkatt(
		  inntekt, 
		  finnTrinnDex(inntekt, grenser), 
	      grenser,
		  prosenter) 
		+ " NOK");
		}
		
	public static double hentBrutto(String hjelpetekst) {
		return parseDouble(showInputDialog(null, hjelpetekst));
	}
	
	public static int finnTrinnDex(double inntekt, int[] trinn) {
		int i;
		for (i=0; i<trinn.length; i++) 
			{if (inntekt <= trinn[i+1]) return i;}
		return i;
	}
		
	public static int beregnSkatt(double inntekt, int trinnDex, int[] grenser, double[] prosenter) {
		double trinnskatt = 0;
		int i;
		for (i = 0; i < trinnDex; i++) {
			trinnskatt += (grenser[i + 1]-grenser[i])*prosenter[i]/100;
		}
		return (int)(trinnskatt + (inntekt - grenser[i])*prosenter[i]/100 + 0.5);
	}

}

















