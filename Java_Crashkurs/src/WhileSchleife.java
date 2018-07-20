
public class WhileSchleife {

	public static void main(String[] args) {
		int zahl = 7;
		int faktor = 10;
		int erg = 0;
		
		while (faktor > 0) {
			erg += zahl; //kurz für erg = erg + Zahl
			faktor--;    //kuzt für faktor = faktor - 1    
		}
		System.out.println(erg);
		
		int wartezeit = 0;

		do {
			System.out.println("Daten werden geladen....");
			wartezeit--;
		} while(wartezeit > 0);

		int[] spieler = new int[5];
			//Zählvariable | Bedingung | Schrittweite je Durchlauf 
		for (int zaehler = 0; zaehler < spieler.length; zaehler++) {
			spieler[zaehler] = zaehler +1;
		}
		
		/* spieler[0] = 1
		 * spieler[1] = 2
		 * spieler[2] = 3
		 * spieler[3] = 4
		 * spieler[4] = 5
		
		
		for (int eintrag = 0; eintrag < spieler.length; eintrag++ ) {
			System.out.println( "Spieler " + spieler[eintrag] + " ist im Spiel." );
		}
		*/
		// einfacher ForEach-Schleife
		//       Zielvariable | Array   
		for (int eintra2 : spieler ) { //Das Erste Element des Arrays wird in der Variable 'eintrag' gespeichert usw.
			System.out.println( "Spieler " + eintra2 + " ist im Spiel." );
		}
		
	}

}
