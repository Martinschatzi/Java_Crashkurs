
public class Rekrusion {

	public static void main(String[] args) {
		Loop(42);
	}
	
	public static void Loop (int anz_loops) {

		anz_loops--;
	if (anz_loops >= 0){
		System.out.println("Noch anz_loops" + anz_loops);
		Loop(anz_loops);
	}
	}
 }
