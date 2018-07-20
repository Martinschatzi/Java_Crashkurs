import java.util.Scanner;

public class EingabenEinlesen {

	
	public static void main(String[] args) {
		String[] eingaben = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < eingaben.length; i++) {
			eingaben[i] = sc.nextLine();
		}
            //Scanner schließen
			sc.close();
			//Ausgabe
		for(String eingabe : eingaben) {
			System.out.println(eingabe);
		}
			
	}

}  //Zum testen, das Programm starten und in der Konsole drei Zeilen schreiben
