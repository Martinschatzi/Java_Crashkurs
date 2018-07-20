
public class Funktionen {

	public static void main(String[] args) {
		addition();
		
		int ergSubtratktion = subtraktion();
		System.out.println(ergSubtratktion);
		
		multiplikation(7, 6);
		
		int ergDivision = division(42,7);
		System.out.println(ergDivision);

	}
	
	static void addition() {     // VOID -> Keine Rückgabe
		int zahl1, zahl2;        // 2 int gleizeitig anlegen
		//Zahle einlesen
		zahl1 = 7;
		zahl2 = 42;
		System.out.println(zahl1 + zahl2);
		}
	
	static int subtraktion() {     // VOID -> Keine Rückgabe
		int zahl1, zahl2;        // 2 int gleizeitig anlegen
		//Zahle einlesen
		zahl1 = 7;
		zahl2 = 6;
		return zahl1 - zahl2;
		}

	static void multiplikation(int zahl1, int zahl2 ) {     // VOID -> Keine Rückgabe
		System.out.println(zahl1 * zahl2);
		}
	
	static int division(int zahl1, int zahl2) {     // VOID -> Keine Rückgabe
		return zahl1 / zahl2;
		}
	
}
