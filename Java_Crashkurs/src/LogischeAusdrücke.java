
public class LogischeAusdr�cke {

	public static void main(String[] args) {
		String modus = "Singleplayer";
		
	if  (modus == "Singleplayer" || modus == "Multiplayer" ) {
		  System.out.println("Spielwelt wird gladen...");
  	}
	else {
		System.out.println("N�1");
		}
   
	boolean spielGekauft = false;
	int     alter        = 17;
	
	if (spielGekauft == true && alter >= 16) {
		System.out.println("Spielwelt wird gladen...");
		}

	else {
		System.out.println("N�2");
		}
	
	if ((spielGekauft == true && alter >= 16) &&  (modus == "Singleplayer" || modus == "Multiplayer" )) {
		System.out.println("Spielwelt wird gladen...");
	}
	else {
		System.out.println("N�3");
		}
	}
/* das ist ein langer Kommentar */
// Das ist kein kurzer Kommentar	
}
