import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {


	private static final int OPTION_QUIT = 4;
	private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("D/MM/yyy");
	private static final DateTimeFormatter date_format = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter time_format = DateTimeFormatter.ofPattern("H:mm");
	ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
	

	public static void main(String[] args) {

	
	

		// ArrayList Package
		ArrayList<Package> packageList = new ArrayList<Package>();
		String start = "01/08/2020";
		String end = "30/08/2020";
		LocalDate startdate = LocalDate.parse(start, format);
		LocalDate enddate = LocalDate.parse(end, format);

		// ArrayList RequestQuotation and Add
		// Cheng Han
		ArrayList<RequestQuotation> QuotList= new ArrayList<RequestQuotation>();
		QuotList.add(new RequestQuotation("HDB", 200,  800 , "abc@gmail.com", 100.1, null, "Whole house", "modern", "none"));

	public static void setHeader(String header) {

		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


	public static void menu() {

		C206_CaseStudy.setHeader("Renovation ACE APP");
		System.out.println("1. View all package");
		System.out.println("2. Quit");
		Helper.line(80, "-");

	}


	private static void CustomerMenu() {

		C206_CaseStudy.setHeader("Customer Home Page");
		System.out.println("1. Visitor account Registration");
		System.out.println("2. Request for Quotation");
		System.out.println("3. Manage Appointment");
	}


	private static void ManageCustomer() {

		C206_CaseStudy.setHeader("MANAGE CUSTOMERS");
		System.out.println("1. Add User Accounts");
		System.out.println("2. View all users");
		System.out.println("3. Delete users");
	}


	private static void AdminMenu() {

		C206_CaseStudy.setHeader("Admin Home Page");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
	}

	// -------------MENU---------------


	private static void appointmentMenu() {

		System.out.println("1. Update Appointment");
		System.out.println("2. Delete Appointment");
		System.out.println("3. Add Appointment");
		System.out.println("4. View Appointment");

	}

	
	private static void packageMenu() {

		System.out.println("1. Add Package");
		System.out.println("2. Delete Package");
		System.out.println("3. View Package");
	}


	private static void requestquotationMenu() {
		System.out.println("1. View all Request Quotation");
		System.out.println("2. Add Request Quotation");
		System.out.println("3. Delete Request Quotation");
		

	}


	public static void ManageQuotationMenu() {

		System.out.println("1. View All ID");
		System.out.println("2. Add Quotation");
		System.out.println("3. Delete Quotation");
		System.out.println("4. Update Quotation");
	}

	// -----------------------Manage Appointment-----------------------//
// Add Appointment
	//Salma
	public static void addappointment() {
		
	
String CustomerName = Helper.readString("Enter your Name > ");
String designerName = Helper.readString("Enter your DesignerName > ");
LocalDateTime appointmentTime = Helper.readLocalDateTime("Enter your appointment time");
LocalDate appointmentDate = Helper.readLocalDate("Enter your appointment date");
Appointment ap = new Appointment(CustomerName, designerName, appointmentDate,appointmentTime);

ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
AppointmentList.add(ap);
System.out.println("Appointment Added");
	}
	
	
	
	
	// Delete Appointment
// Salma
public static void deleteappointment(){
String CustomerName = Helper.readString("Enter Name of Customer for the appointment to be cancelled> ");

ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
for (int i = 0; i < AppointmentList.size(); i++) {
		if (( AppointmentList.get(i)).getName() == CustomerName) {
		AppointmentList.remove(i);
		System.out.println("Appointment Cancelled Successfully");
		}
}
}





//Update Appointment
// Salma
public static void updateappointment() {
ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
String CustomerName = Helper.readString("Enter name of Customer whose appointment is to be updated > ");
boolean found = false;
for (int i = 0; i < AppointmentList.size(); i++) {
	if (CustomerName.equalsIgnoreCase(AppointmentList.get(i).getName())) {
		String designerName = Helper.readString("Enter new designer name > ");
		AppointmentList.get(i).setCustomerName(CustomerName);
		AppointmentList.get(i).setDesignerName(designerName);
		found = true;
	}
}
if (found == false) {
	System.out.println("Customer with the name has no appointment");
} else {
	System.out.println("Appointment successfully Updated");
}
}

//view appointment
//salma
public static void viewappointment() {

		ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
		for (Appointment a : AppointmentList1) {
			String output = String.format("Name: %s\nCustomerName: %s\nDesignerName\n",
					a.getcustomerName(), a.getdesignerName());
			System.out.println(output);
		}
		

}


	// -----------------------------Manage Package------------------------//

	
	// View package
	//Hakim

	
	
	public static String viewAllPackage(ArrayList<Package>PackageList) {
	for (Package p : PackageList) {
		String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nPassword: %s\nStatus: %s\n Town%s\n",
				p.getName(), p.getRole(), p.getEmail(), p.getPassword(), p.getStatus(), p.getTown());
		System.out.println(output);
	}
	}

	// Add package
	//Hakim

	public static Package addPackage() {
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

	

	// ---------------Manage Request Quotation-----------------//



	//VIEW REQUEST QUOTATION
	// Cheng Han
	
	public static void viewAllRequestQuotation(ArrayList<RequestQuotation> QuotList) {

		C206_CaseStudy.setHeader("Request Quotation LIST");

	
		for(RequestQuotation Q : QuotList) {
		
		String output = String.format("%-15s %-10s %-10s %-20s %-10s %-15s %-15s %-15s %-15s \n", "PROPERTY TYPE",
				"AREA SIZE", "CONTACT", "EMAIL", "BUDGET RANGE", "COMPLETETION DATE", "RENOVATION TYPE", "RENOVATION STYLE", "URGENCY");
		System.out.println(output);
	}

		// TODO Auto-generated method stub

	}

	// ADD REQUEST QUOTATION
	// Cheng Han
	public static RequestQuotation AddRequestQuotation() {

		String propertytype = Helper.readString("Enter Property Type > ");
		double areasize = Helper.readDouble("Enter Areasize > ");
		int contact = Helper.readInt("Enter Contact> ");
		String email = Helper.readString("Enter Email> ");
		double budget = Helper.readDouble("Enter Budget : ");
		String date = Helper.readString("Enter Complete Date :");
		LocalDate completeDate = LocalDate.parse(date);
		String renovationtype = Helper.readString("Enter Renovation Type : ");
		String renovationstyle = Helper.readString("Enter Renovation Style : ");
		String urgency = Helper.readString("Urgency : ");

		RequestQuotation rq = new RequestQuotation(propertytype, areasize, contact, email, budget, completeDate, renovationtype, renovationstyle, urgency);
		
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		QuotList.add(rq);
		System.out.println("Request Quotation List Added");
		// TODO Auto-generated method stub

	}

	public static void addRequestQuotation(ArrayList<RequestQuotation> requestquotationList, RequestQuotation rq) {

		requestquotationList.add(rq);
		System.out.println("Request Quotation added");
	}

	// DELETE REQUEST QUOTATION
	// Cheng Han
	public static void deleteRequestQuotation(ArrayList<RequestQuotation> requestquotationList, int delete) {

		int  contactname = Helper.readInt("Enter Contact of Request Quotationto delete> ");
		
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		for (int i = 0; i < QuotList.size(); i++) {
			if (QuotList.get(i).getcontact() == contactname) {
				QuotList.remove(i);
				System.out.println("Request Quotation Removed");
			}
		}
	}
	// --------------------------Manage Quotation----------

	//Liu DeHai
    ArrayList<Quotation> QList = new ArrayList<Quotation>();
//View

public static void viewAllQuotation(ArrayList<Quotation>Quotation) {
    Helper.line(60, "-");
    System.out.println("Quotation LIST");
    Helper.line(60, "-");
    String output = String.format("%-10s %-20s %-15s %-20s \n", "Designer Name", "Total Cost Range", "Start Renovate Date Range","Renovation Type");


    for (int i = 0; i < Quotation.size(); i++) {


        output += String.format("%-15s %-20s %-15d %-20s\n",Quotation.get(i).getName(),Quotation.get(i).getCostRange()
                                ,Quotation.get(i).getCostRange(),Quotation.get(i).getType());
    }
        System.out.println(output);
}
//ADD
public static void addQuotations(ArrayList<Quotation>Quotation) {
    String DesignerName = Helper.readString("Enter Designer Name >");
    String CostRange = Helper.readString("Enter Total Cost Range >");
    String SDRange = Helper.readString("Enter Start Renovate Date Range >");
    String Type = Helper.readString("Enter Renovation Type >");
    
    Quotation Y = new Quotation(DesignerName, CostRange, SDRange, Type);
    Quotation.add(Y);
    System.out.println("Quotation added");
}
//Update
public static void updateQuotations(ArrayList<Quotation>Quotation){
    String name =Helper.readString("Enter Designer Name >");
    for (int i = 0; i < Quotation.size(); i++) {
    if(name !=Quotation.get(i).getName()){
        System.out.println("This record is not exist");
        break;
    }else {
        String Dname =Helper.readString("Enter current Designer Name >");
        if(Dname.equals(Quotation.get(i).getName())){
            String NewDname = Helper.readString("Enter new Designer Name >");
            NewDname = (String) Quotation.get(i).getName();
            String NewCRange = Helper.readString("Enter new Cost Range  >");
            NewCRange = Quotation.get(i).getCostRange();
            String NewRDRange  = Helper.readString("Enter new Renovate Date Range >");
            NewRDRange = Quotation.get(i).getCostRange();
            String NewType = Helper.readString("Enter new Renovation Type >");
            NewType = Quotation.get(i).getType();
        
            System.out.println("Change has Successfully made");
    }
    }
    }
            
        }
//Delete
        public static void DeleteByName(ArrayList<Quotation>Quotation) {
            String name = Helper.readString("Enter name to search > ");
            boolean QuotationDeleted=false;
            for (int i =0;i< Quotation.size(); i++) {
                if(Quotation.get(i)!=null && Quotation.get(i).Name.equalsIgnoreCase(name)) {
                    Quotation.remove(i);
                    QuotationDeleted=true;
                    break;
                }
            }
            if(QuotationDeleted==true) {
                System.out.println("Quotation is successfully deleted");
            }else {
                System.out.println("Quotations is has not deleted");
            }



    }



	// ---------------Manage Customer------------------

        
        // Search Customer
        //timorthy
        
        public static void searchCustomer() {
        	 ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String town = Helper.readString("Enter town > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (town.equalsIgnoreCase(CustomerList.get(i).getTown())) {
				String output = String.format(
						"Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\nTown: %s\n",
						CustomerList.get(i).getName(), CustomerList.get(i).getRole(),
						CustomerList.get(i).getEmail(), CustomerList.get(i).getPassword(),
						CustomerList.get(i).getStatus(), CustomerList.get(i).getTown());
				System.out.println(output);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("User with specific town not found!");
		}
		
        }
		// Add Customer
		
		// Timorthy
		public static void addCustomer() {
			
			 ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String name = Helper.readString("Enter name of user to edit > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				String email = Helper.readString("Enter new email > ");
				String password = Helper.readString("Enter new password > ");
				CustomerList.get(i).setEmail(email);
				CustomerList.get(i).setPassword(password);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("User with specific name not found!");
		} else {
			System.out.println("User account updated");
		}
		}
		// View Customer
		public static void ViewCustomer() {
			ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		
		for (Customer c : CustomerList) {
			String output = String.format("Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\n Town%s\n",
					c.getName(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(), c.getTown());
			System.out.println(output);
		}
		
		
		// Delete Customer
		String name = Helper.readString("Enter name > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				CustomerList.remove(i);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("Name not found!");
		}
		// Login Customer
		
		
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");
		boolean success = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (CustomerList.get(i).isBlocked()) {
				if (email.equalsIgnoreCase(CustomerList.get(i).getEmail())) {
					if (password.equalsIgnoreCase(CustomerList.get(i).getPassword())) {
						success = true;
					} else {
						CustomerList.get(i).setAttempts(CustomerList.get(i).getAttempts() + 1);
						if (CustomerList.get(i).getAttempts() > 3) {
							CustomerList.get(i).setBlocked(true);
							System.out.println("User is blocked from too many attempts!");
						}
					}
					System.out.println("Wrong Password!");
				}
				if (success) {
					System.out.println("Logged in!");
				}
			} else {
				System.out.println("User is blocked from too many attempts!");
			}
		}
		int option = 0;
	
		while (option != 7) {
			System.out.println("=========================");
			System.out.println("1. Add User Account");
			System.out.println("2. View All User");
			System.out.println("3. Delete user by name");
			System.out.println("4. Search user by town");
			System.out.println("5. Edit user account");
			System.out.println("6. User Login");
			System.out.println("7. Exit");
			option = Helper.readInt("Choose an option > ");
			System.out.println("=========================");
			if (option == 1) {
				String name1 = Helper.readString("Enter your name > ");
				String role = Helper.readString("Enter your role > ");
				String email1 = Helper.readString("Enter your email > ");
				String password1 = Helper.readString("Enter your password > ");
				String status = Helper.readString("Enter your status > ");
				String town = Helper.readString("Enter your town > ");
				CustomerList.add(new Customer(name1, role, email1, password1, status, town));
				/*
				 * } else if (option == 2) { for (ManageCustomer c : CustomerList) { String
				 * output = String.
				 * format("Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\n Town%s\n",
				 * c.getName(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(),
				 * c.getTown()); System.out.println(output); } } else if (option == 3) { String
				 * name = Helper.readString("Enter name > "); boolean found = false; for (int i
				 * = 0; i < CustomerList.size(); i++) { if
				 * (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				 * CustomerList.remove(i); found = true; } } if (found == false) {
				 * System.out.println("Name not found!"); } } else if (option == 4) { String
				 * town = Helper.readString("Enter town > "); boolean found = false; for (int i
				 * = 0; i < CustomerList.size(); i++) { if
				 * (town.equalsIgnoreCase(CustomerList.get(i).getTown())) { String output =
				 * String.format(
				 * "Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\nTown: %s\n",
				 * CustomerList.get(i).getName(), CustomerList.get(i).getRole(),
				 * CustomerList.get(i).getEmail(), CustomerList.get(i).getPassword(),
				 * CustomerList.get(i).getStatus(), CustomerList.get(i).getTown());
				 * System.out.println(output); found = true; } } if (found == false) {
				 * System.out.println("User with specific town not found!"); } } else if (option
				 * == 5) { String name = Helper.readString("Enter name of user to edit > ");
				 * boolean found = false; for (int i = 0; i < CustomerList.size(); i++) { if
				 * (name.equalsIgnoreCase(CustomerList.get(i).getName())) { String email =
				 * Helper.readString("Enter new email > "); String password =
				 * Helper.readString("Enter new password > ");
				 * CustomerList.get(i).setEmail(email);
				 * CustomerList.get(i).setPassword(password); found = true; } } if (found ==
				 * false) { System.out.println("User with specific name not found!"); } else {
				 * System.out.println("User account updated"); } } else if (option == 6) {
				 * String email = Helper.readString("Enter email > "); String password =
				 * Helper.readString("Enter password > "); boolean success = false; for (int i =
				 * 0; i < CustomerList.size(); i++) { if (CustomerList.get(i).isBlocked()) { if
				 * (email.equalsIgnoreCase(CustomerList.get(i).getEmail())) { if
				 * (password.equalsIgnoreCase(CustomerList.get(i).getPassword())) { success =
				 * true; } else {
				 * CustomerList.get(i).setAttempts(CustomerList.get(i).getAttempts() + 1); if
				 * (CustomerList.get(i).getAttempts() > 3) {
				 * CustomerList.get(i).setBlocked(true);
				 * System.out.println("User is blocked from too many attempts!"); } }
				 * System.out.println("Wrong Password!"); } if (success) {
				 * System.out.println("Logged in!"); } } else {
				 * System.out.println("User is blocked from too many attempts!"); } }
				 */
			}
		}
}
}
		
