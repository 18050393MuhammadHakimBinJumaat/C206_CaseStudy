import java.util.ArrayList;



//Cheng han
public class ViewRequestQuotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<RequestQuotation> QuotList= new ArrayList<RequestQuotation>();
		for(RequestQuotation Q : QuotList) {
		
		String output = String.format("%-15s %-10s %-10s %-20s %-10s %-15s %-15s %-15s %-15s \n", "PROPERTY TYPE",
				"AREA SIZE", "CONTACT", "EMAIL", "BUDGET", "COMPLETE DATE", "RENO TYPE", "RENO STYLE", "URGET");
		System.out.println(output);
	}

		// TODO Auto-generated method stub

	}
}
