import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
			File daten = new File("daten.txt");
			
			try {
				Scanner  sc = new Scanner(daten);
			
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			
			sc.close();  //Scanner schlieﬂen
			}
		catch (Exception e) {
		System.out.println("Fehler, Datei nicht gefunden!!!");	
		}

	}

}
