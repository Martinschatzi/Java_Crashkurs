
//OrangeOnBlack
public class IfElse {

	public static void main(String[] args) {
		int int1 = 5;
		int int2 = 6;
		
		if ( int1 < int2 ) {
			System.out.println("int1 ist kleiner als int2");
			}
		
		boolean bool = true;
		
		if ( bool == true ) {
			System.out.println("bool ist true");
			}
		
		if ( bool ) {
			System.out.println("bool ist true");
			}
		
		bool = 7>= 8;          // != == 
		
		if ( !bool ) {                // ( bool == false )
			System.out.println("bool ist false");
			}
		else {
			System.out.println("bool ist true");
			}
		
		
		if ( int1 == 3 ) {                // ( bool == false )
			System.out.println("int1 ist 3");
			}
		else if (int1 == 4) {
			System.out.println("int1 ist gleich 4");
			}
		else if (int1 == 5){
			System.out.println("int1 ist gleich 5");
			}
		
		else {
			System.out.println("int1 ist weder 3 noch 4 noch 5");
			}
		
		
	}
}
