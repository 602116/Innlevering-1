package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		int bruttolonn = Integer.parseInt(showInputDialog("Bruttolønn"));
		int lonn;
		
		if ( bruttolonn < 0 ) {
			
			showMessageDialog(null, "Bruttolønn må vere meir enn 0");
		}
		else if( bruttolonn >= 934051) {
			
			lonn = (int)(bruttolonn*0.1452);
			showMessageDialog(null, lonn);
			
		}
		else if ( bruttolonn >= 580651 ) {
			
			lonn = (int)(bruttolonn*0.1152);
			showMessageDialog(null, lonn);
			
		}
		else if ( bruttolonn>=230951 ) {
			
			lonn = (int)(bruttolonn*0.0241);
			showMessageDialog(null, lonn);
		}
		else if ( bruttolonn>=164101 ) {
		
			lonn = (int)(bruttolonn*0.0093);
			showMessageDialog(null, lonn);
			
		}
		else{

			showMessageDialog(null, "Ingen trinnskatt");
		}
			
	}

}