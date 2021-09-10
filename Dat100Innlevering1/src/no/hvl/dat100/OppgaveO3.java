package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		
		int heltall	= Integer.parseInt(showInputDialog("Heiltall"));
		if(heltall>0) {
			int sum = 1;
			
			while(heltall>1) {
				sum*=heltall;
				heltall--; 
				System.out.println(sum);
			}	
			
			showMessageDialog(null, sum);
		}
		else {
			showMessageDialog(null, "Tallet må vere meir enn 0");
		}

	}

}
