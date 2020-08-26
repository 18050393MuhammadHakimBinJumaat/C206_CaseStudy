import java.time.LocalDate;
import java.util.ArrayList;

//Hakim
public class AddPackage {

	public static Package main(String[] args) {
		// TODO Auto-generated method stub
		
		String PropType = Helper.readString("Enter Property Type > ");
		double Areasize = Helper.readDouble("Enter Areasize > ");
		int Contact = Helper.readInt("Enter Contact> ");
		String Email = Helper.readString("Enter Email> ");
		double Budget = Helper.readDouble("Enter Budget : ");
		String Date = Helper.readString("Enter Complete Date :");
		LocalDate completeDate = LocalDate.parse(Date);
		String RenoType = Helper.readString("Enter Renovation Type : ");
		String RenoStyle = Helper.readString("Enter Renovation Style : ");
		String Urg = Helper.readString("Is it urgent > ");

		RequestQuotation rq = new RequestQuotation(PropType, Areasize, Contact, Email, Budget, completeDate, RenoType, RenoStyle, Urg);
		
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		QuotList.add(rq);
		System.out.println("Request Quotation List Added");
		return null;
	
	}
}
