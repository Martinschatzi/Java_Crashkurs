
//OrangeOnBlack
public class Arrays {

	public static void main(String[] args) {

		int[] array1;
		array1 = new int[3];
		array1[0] = 7;	
		array1[1] = 42;	
		array1[2] = 1337;	
		System.out.println(array1[0]);
		
        int int1 = 3;
        int int2 = 4;
        int2 = int1;
        int2 = 5;
        System.out.println(int1);
        
        int[] array2;
        array2 = array1;                           //hier wird nur der Zeiger übergeben
        array2[0] = 14;
		System.out.println(array1[0]);
		
		int[] array3;
		array3 = new int[3];
		array3 = array1;                          //So geht es auch nicht. Der Zeiger von array3 wird überschrieben.                      
        array3[0] = 33;
		System.out.println(array1[0]);
		
		
		String[] sArray = new String[3];
		sArray[0] = "Peter";	
		sArray[1] = "Paul";	
		sArray[2] = "Frank";
		System.out.println(sArray[2] + " hat " + array1[2] + " Geld." );
		
	}

}
