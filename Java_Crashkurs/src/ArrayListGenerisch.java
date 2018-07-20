import java.util.ArrayList;

public class ArrayListGenerisch {

	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<String>();   

		liste.add("eins");
		liste.add("zwei");
		liste.add("drei");
		liste.add("vier");
		liste.add("fünf");
		
		for (String element : liste) {
			System.out.println(element);
		}
		
		//kein int weil int kein Objekt ist.-> Integer oder auch Float 
		ArrayList<Integer> int_liste = new ArrayList<Integer>();   

		int_liste.add(1);
		int_liste.add(2);
		int_liste.add(3);
		int_liste.add(4);
		int_liste.add(5);
		
		for (Integer element : int_liste) {
			System.out.println(element);
		}
	}

}
