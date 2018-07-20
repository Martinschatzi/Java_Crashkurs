
public class LogischeAusdrücke {

	public static void main(String[] args) {
		String modus = "Singleplayer";
		
	if  (modus == "Singleplayer" || modus == "Multiplayer" ) {
		  System.out.println("Spielwelt wird gladen...");
  	}
	else {
		System.out.println("Nö1");
		}
   
	boolean spielGekauft = false;
	int     alter        = 17;
	
	if (spielGekauft == true && alter >= 16) {
		System.out.println("Spielwelt wird gladen...");
		}

	else {
		System.out.println("Nö2");
		}
	
	if ((spielGekauft == true && alter >= 16) &&  (modus == "Singleplayer" || modus == "Multiplayer" )) {
		System.out.println("Spielwelt wird gladen...");
	}
	else {
		System.out.println("Nö3");
		}
	}
/* das ist ein langer Kommentar */
// Das ist kein kurzer Kommentar	
}
