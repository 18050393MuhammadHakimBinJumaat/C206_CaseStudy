import java.time.LocalDate;
import java.util.ArrayList;

/**
 * I declare that this code was written by me
  * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
 * 19014273, 22 Aug 2020 7:59:37 pm

 */

/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*19014273, 22 Aug 2020 7:59:37 pm
 */

//Cheng Han
public class AddRequestQuotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String PropType = Helper.readString("Enter Property Type > ");
		double Areasize = Helper.readDouble("Enter Areasize > ");
		int Contact = Helper.readInt("Enter Contact> ");
		String Email = Helper.readString("Enter Email> ");
		double Budget = Helper.readDouble("Enter Budget : ");
		String Date = Helper.readString("Enter Complete Date :");
		LocalDate completeDate = LocalDate.parse(date);
		String RenoType = Helper.readString("Enter Renovation Type : ");
		String RenoStyle = Helper.readString("Enter Renovation Style : ");
		String Urg = Helper.readString("Is it urgent > ");

		RequestQuotation rq = new RequestQuotation(PropType, Areasize, Contact, Email, Budget, completeDate, RenoType, RenoStyle, Urg);
		return rq;
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		// TODO Auto-generated method stub

	}

}
