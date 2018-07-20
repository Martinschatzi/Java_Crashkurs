
//OrangeOnBlack
public class Variablen {

	public static void main(String[] args) {
		int   zahl           = 42;       // +/- 2 Milliarden
		long  großeZahl      = 1337L;	 // wirklich große zahlen //L steht für lang (sollte man mit schreiben)
		short kleineZahl     = 7;        // -32.768 bis 31.767
		byte  sehrkleineZahl = -7;       // -128 bis 128
		
		float	kommaZahl         = 3.14f;	  // weniger Nachkommastellen
		double  genauereKommaZahl = 3.14159d; // mehr Nachkommastellen
		
		char    zeichen = 'F';          // ein Zeichen also Buchstabe/Zahl/Sonderzeichen
		
		System.out.println(zeichen);	
		
		boolean wahrOderFalsch = true;   // true/false
		
		char zeichen2;
		zeichen2 = 'U';
		System.out.println(zeichen2);	
		zeichen2 = 'N';
		System.out.println(zeichen2);
		System.out.println(zahl);

	}

}
