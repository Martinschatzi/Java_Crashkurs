
public class Raubkatze extends Katze {

	String beute;    //Bevorzugte Beute 
	
	public Raubkatze(String dieRasse, int dasGewicht, String dieBeute) {
		super(dieRasse, dasGewicht);
		beute = dieBeute;
	}

}
