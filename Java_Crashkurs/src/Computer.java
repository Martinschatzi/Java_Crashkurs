

public class Computer {
	String prozessor;             //Wenn kein Public oder Private davor steht, dann gilt die Package Sichtbarkeit
	String grafikkarte;
	int arbeitsspeicher;
	float preis;
	
	//Der Konstruktor heiﬂt immer wie die Klasse selbst
	Computer(String derProzessor, String dieGrafikkarte, int derArbeitsspeicher, float derPreis){
		prozessor = derProzessor;
		grafikkarte = dieGrafikkarte;
		arbeitsspeicher = derArbeitsspeicher;
		preis = derPreis;
	}
	
	void Datenblatt () {
		System.out.println("Prozessor      : " + prozessor);
		System.out.println("Grafikkarte    : " + grafikkarte);
		System.out.println("Arbeitsspeicher: " + arbeitsspeicher);
		System.out.println("Preis          : " + preis);
	}
	
	
}
