import java.time.LocalDate;
import java.util.ArrayList;

//Hakim
public class AddPackage {

	public static Package main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String PropType = Helper.readString("Enter Property Type > ");
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
		return null;*/
		int option = 0;
		ArrayList<Package> PackageList = new ArrayList<Package>();
		while (option != 7) {
			System.out.println("=========================");
			System.out.println("1. Add Package");
			System.out.println("2. View Package");
			System.out.println("3. Update Package");
			System.out.println("4. Search Package");
			System.out.println("5. Exit");
			option = Helper.readInt("Choose an option > ");
			System.out.println("=========================");
			if (option == 1) {
				String code = Helper.readString("Enter package name > ");
				String description = Helper.readString("Enter description of package > ");
				String startDate = Helper.readString("Enter the start date > ");
				String endDate = Helper.readString("Enter the end date > ");
				String amountPackage = Helper.readString("Enter the amount of package > ");
				
				PackageList.addAll(new Customer(code, description, startDate, endDate, amountPackage));
		
		
			
	}
}
