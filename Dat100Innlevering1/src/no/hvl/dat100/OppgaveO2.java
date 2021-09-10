package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for(int tall=0; tall<10; tall++) {
			
		
			int poeng = Integer.parseInt(showInputDialog("Antall poeng"));
		
			if (poeng<=39 && poeng>=0) {
				
				System.out.println("F");
			}
			else if (poeng<= 49) {
				
				System.out.println("E");
			}
			else if (poeng<= 59) {
				
				System.out.println("D");
			}
			else if (poeng<= 79) {
				
				System.out.println("C");
			}
			else if (poeng<= 89) {
				
				System.out.println("B");
			}
			else if (poeng<= 100) {
				
				System.out.println("A");
			}
			else if (poeng>=101) {
				
				System.out.println("Ugyldig poengsum, skriv inn på nytt");
				tall--;
			}
			else if (poeng<=-1) {
				
				System.out.println("Ugyldig poengsum, skriv inn på nytt");
				tall--;
			}
		}

	}

}