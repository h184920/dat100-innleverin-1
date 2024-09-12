package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class O1 {
	
	final static int ØVRE_GRENSE = 100;
	final static int NEDRE_GRENSE = 0;
	final static int[] GRENSER = {90, 80, 60, 50, 40, 0}; 
	final static String[] KARAKTERER = {"A", "B", "C", "D", "E", "F"};
	
	
	public static void main(String[] args) {
		
		String karakteren; int elevPoeng, antallElever = 10; 
		boolean avslutt = false; 
		
		for (int e = 1; e <= antallElever && ! avslutt; e++) {
			
		  elevPoeng = taTall("Poengsum fra 0 til 100");
		 
		  if (! validInput(elevPoeng, ØVRE_GRENSE, NEDRE_GRENSE)) {

			  avslutt = showInputDialog("Poengsummen ligger et sted mellom 0 og 100\n"
			   + "Hvis du ønsker å avslutte; tast inn tallet '0' "
			   + "(dette vil ikke blir regnet som en poengsum herfra)").equals("0");
			  e--;
		  }
		  else {
			  karakteren = settKarakter(elevPoeng, GRENSER, KARAKTERER);
			  showMessageDialog(null, "Karakter: " + karakteren);
		  }
		}
	}
	
		public static int taTall(String hjelpetekst) {
			int score = parseInt(showInputDialog(null, hjelpetekst));
			return score;
		}
		
		public static String settKarakter(int score, int[] grenser, String[] strKarak) {
			int index = plasserSkåre(score, grenser);
			return strKarak[index];
		}
		
		public static boolean validInput(int score, int øvre, int nedre) {
			return (nedre <= score && score <= øvre);
		}
		
		public static int plasserSkåre(int score, int[] grenser) {
			int i; for (i = 0; i < grenser.length; i++) {
				if (score >= grenser[i]) break;
			}
			return i;
		}
		

}


