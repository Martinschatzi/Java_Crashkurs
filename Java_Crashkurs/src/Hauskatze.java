
public class Hauskatze extends Katze {
	String name; // Name der Hauskatze
	
	// Konstruktor
	Hauskatze(String rasse, int gewicht, String derName){
		super(rasse, gewicht);
		this.name = derName;
	}
	
	void miau() {                      //Die Hauskatze kann miauen
		System.out.println("miau"); 
	}

}
