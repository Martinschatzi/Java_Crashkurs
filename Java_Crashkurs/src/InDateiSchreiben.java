import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InDateiSchreiben {

		public static void main(String[] args) throws IOException {
			
			Scanner  sc = new Scanner(System.in);
			FileWriter file = new FileWriter(new File("daten.txt"));
			
			String eingabe = "";
						
			while(!eingabe.equals("q")) {
				eingabe =  sc.nextLine();
				file.write(eingabe + "\n");
				
			}
			sc.close();    //Scanner schlie�en
			file.close();  //Datei schlie�en

	}

}
