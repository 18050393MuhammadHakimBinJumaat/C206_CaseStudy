import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {


	private static final int OPTION_QUIT = 4;
	private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyy");
	private static final DateTimeFormatter date_format = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter time_format = DateTimeFormatter.ofPattern("H:mm");
	private static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	private static ArrayList<Designer> designerList = new ArrayList<Designer>();

	public static void main(String[] args) {

	
		LocalDate localDate1 = LocalDate.parse("20/08/2021", date_format);
		LocalTime localtime1 = LocalTime.parse("20:00", time_format);
		LocalTime localtime2 = LocalTime.parse("13:00", time_format);
		Appointment a1 = new Appointment(localDate1, localtime1, "Tim", "Address Blk1", "Customer123");
		Appointment a2 = new Appointment(LocalDate.now(), localtime2, "Tom", "Address Blk10", "Customer321");
		appointmentList.add(a1);
		appointmentList.add(a2);
		designerList.add(new Designer("Tim"));
		designerList.add(new Designer("Tom"));
		designerList.add(new Designer("Jason"));

		// ArrayList Package
		ArrayList<Package> packageList = new ArrayList<Package>();
		String start = "10/10/2020";
		String end = "10/11/2020";
		LocalDate startdate = LocalDate.parse(start, format);
		LocalDate enddate = LocalDate.parse(end, format);
		packageList.add(new Package(1, "This package is for testing", startdate, enddate, 100.50));

		// ArrayList RequestQuotation and Add
		ArrayList<RequestQuotation> requestquotationList = new ArrayList<RequestQuotation>();
		requestquotationList.add(
				new RequestQuotation("HDB", 100, 999, "123@gmail.com", 100.1, null, "Whole house", "modern", "none"));

		// ArrayList Quotation 
		ArrayList<Quotation> manageQuotationList = new ArrayList<Quotation>();

		// ArrayList Customer
		ArrayList<Customer> userCustList = new ArrayList<Customer>();

	
		int option = 0;

		
		while (option != OPTION_QUIT) {

			menu();

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all package
				C206_CaseStudy.viewAllPackage(packageList);

			} else if (option == 2) {
				// Login as Customer
				// Joshua
				CustomerMenu();

				int CustomerOption = Helper.readInt("Enter an option > ");

				if (CustomerOption == 1) {
					// Visitor account Registration
					Customer cu = inputCustomer();
					C206_CaseStudy.addCustomer(userCustList, cu);

				} else if (CustomerOption == 2) {
					// Request for Quotation
					RequestQuotation rq = inputRequestQuotation();
					C206_CaseStudy.addRequestQuotation(requestquotationList, rq);

				} else if (CustomerOption == 3) {
					// Manage Appointment
					Helper.line(80, "-");
					Helper.line(80, "-");
					System.out.println("Option 1: Add Appointment");
					System.out.println("Option 2: remove Appointment");
					System.out.println("Option 3: View all Appointment");

					int customerAppointment = Helper.readInt("Enter an option > ");

					if (customerAppointment == 1) {			
						Helper.line(80, "-");
						addAppointment();

					}else if (customerAppointment == 2) {			
						Helper.line(80, "-");
						removeAppointment();

					}else if (customerAppointment == 3) {
						viewAllAppointment(appointmentList);
					}

				} else {

					System.out.println("Invaild Option!");
				}

			} else if (option == 3) {

				// Login as Admin
				AdminMenue();

				int AdminOption = Helper.readInt("Enter an option > ");

				if (AdminOption == 1) {
					C206_CaseStudy.CustomerMenu();
					int CustomerOption = Helper.readInt("Enter an option > ");
					if (CustomerOption == 1) {
						Customer cu = inputCustomer();
						C206_CaseStudy.addCustomer(userCustList, cu);

					} else if (CustomerOption == 2) {

						// Request for Quotation
						RequestQuotation rq = inputRequestQuotation();
						C206_CaseStudy.addRequestQuotation(requestquotationList, rq);

					} else if (CustomerOption == 3) {
						// Manage Appointment

					} else {
						System.out.println("Invaild Option!");
					}

					// Manage Customer
				
				} else if (AdminOption == 2) {

					C206_CaseStudy.packageMenu();

					int PackageOption = Helper.readInt("Enter an option > ");

					if (PackageOption == 1) {
						Package pp = inputPackage();
						C206_CaseStudy.addPackage(packageList, pp);

					} else if (PackageOption == 2) {
						int delete = Helper.readInt("Enter code to delete > ");
						C206_CaseStudy.deletePackage(packageList, delete);

					} else if (PackageOption == 3) {
						C206_CaseStudy.updatePackage(packageList);
					}

					// Manage Package
				
				} else if (AdminOption == 3) {

					C206_CaseStudy.requestquotationMenu();
					int requestquotationOption = Helper.readInt("Enter an option > ");

					if (requestquotationOption == 1) {
						C206_CaseStudy.viewAllRequestQuotation(requestquotationList);

					} else if (requestquotationOption == 2) {
						int delete = Helper.readInt("Enter an code to delete > ");
						C206_CaseStudy.deleteRequestQuotation(requestquotationList, delete);
					}

					// Manage Customer
				} else if (AdminOption == 4) {

					
					// Manage Quotation
					C206_CaseStudy.ManageQuotationMenu();

					int quotationOption = Helper.readInt("Enter an option > ");

					if (quotationOption == 1) {
						C206_CaseStudy.viewAllQuotation(manageQuotationList);
					}

					else if (quotationOption == 2) {
						int requestID = Helper.readInt("Enter ID: ");
						int quotationID = Helper.readInt("Enter Quotation ID: ");
						String renovationCat = Helper.readString("Enter Renovation Category: ");
						String description = Helper.readString("Enter Description Of Renovation Items: ");
						String name = Helper.readString("Enter Designer Name: ");
						String startDate = Helper.readString("Enter Start Date: ");
						double totalAmount = Helper.readDouble("Enter Total Quotation Amount: ");

						C206_CaseStudy.addQuotation(manageQuotationList, createQuotation(requestID, quotationID,
								renovationCat, description, name, startDate, totalAmount));
					}

					else if (quotationOption == 3) {
						int delete = Helper.readInt("Enter Quotation ID To Delete: ");
						C206_CaseStudy.deleteQuotation(manageQuotationList, delete);
					}

				} else if (AdminOption == 5) {
					// Manage Appointment
					adminAppointment();

				} else {
					System.out.println("Invaild Option!");
				}
			}
		}

	}

	private static void removeAppointment() {

		String customerName = Helper.readString("Enter Customer Name: ");

		for (int i = 0; i < appointmentList.size(); i++) {
			if (customerName.equalsIgnoreCase(appointmentList.get(i).getcustomerName())) {
				removeAppointment(appointmentList, appointmentList.get(i), customerName);

			} else {
				System.out.println("Customer not Found !");
			}
		}
	}

	private static void addAppointment() {

		String customerName = Helper.readString("Enter Customer Name: ");
		String address = Helper.readString("Enter Address: ");
		String designerName = Helper.readString("Enter Designer Name: ");
		String appointmentDate = Helper.readString("Enter appointment Date (dd/mm/yyyy): ");
		String appointmentTime = Helper.readString("Enter appointment Time (hh:ss): ");
		LocalDate localDate3 = LocalDate.parse(appointmentDate, date_format);
		LocalTime localtime3 = LocalTime.parse(appointmentTime, time_format);
		Appointment appointment1 = new Appointment(localDate3, localtime3, designerName, address,
				customerName);
		addAppointment(appointmentList, appointment1);
	}


	public static void setHeader(String header) {

		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


	public static void menu() {

		C206_CaseStudy.setHeader("Renovation ACE APP");
		System.out.println("1. View all package");
		System.out.println("2. Login as Customer");
		System.out.println("3. Login as Admin");
		System.out.println("4. Quit");
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


	private static void AdminMenue() {

		C206_CaseStudy.setHeader("Admin Home Page");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
	}

	// -----------------------------------------------------Menu---------------------------------------------------//


	private static void appointmentMenu() {

		System.out.println("1. View All Designers");
		System.out.println("2. Make Appointment");
		System.out.println("3. Update Appointment");
		System.out.println("4. Delete Appointment");
		System.out.println("5. View Appointment");

	}

	
	private static void packageMenu() {

		System.out.println("1. Add Package");
		System.out.println("2. Remove Package");
		System.out.println("3. Update Package");
	}


	private static void requestquotationMenu() {
		System.out.println("1. View all Request Quotation");
		System.out.println("2. Remove Request Quotation");
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
String CustomerName = Helper.readString("Enter your Name > ");
String designerName = Helper.readString("Enter your DesignerName > ");
LocalDateTime appointmentTime = Helper.readLocalDateTime("Enter your appointment time");
LocalDate appointmentDate = Helper.readLocalDate("Enter your appointment date");
Appointment ap = new Appointment(CustomerName, designerName, appointmentDate,appointmentTime);

ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
AppointmentList.add(ap);
System.out.println("Appointment Added");
	
	// Delete Appointment
// Salma

String CustomerName = Helper.readString("Enter Name of Customer for the appointment to be cancelled> ");

ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
for (int i = 0; i < AppointmentList1.size(); i++) {
		if (( AppointmentList1.get(i)).getName() == CustomerName) {
		AppointmentList1.remove(i);
		System.out.println("Appointment Cancelled Successfully");
	}
}
//Update Appointment
ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
String CustomerName = Helper.readString("Enter name of Customer whose appointment is to be updated > ");
boolean found = false;
for (int i = 0; i < AppointmentList1.size(); i++) {
	if (CustomerName.equalsIgnoreCase(AppointmentList1.get(i).getName())) {
		String designerName = Helper.readString("Enter new designer name > ");
		AppointmentList1.get(i).setCustomerName(CustomerName);
		AppointmentList1.get(i).setDesignerName(designerName);
		found = true;
	}
}
if (found == false) {
	System.out.println("Customer with the name has no appointment");
} else {
	System.out.println("Appointment successfully Updated");
}
	// -----------------------------Manage Package------------------------//

	
	// View package
	//Hakim
	ArrayList<Package> PackageList = new ArrayList<Package>();
	
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
	public static void viewAllRequestQuotation(ArrayList<RequestQuotation> requestquotationList) {

		C206_CaseStudy.setHeader("Request Quotation LIST");

		ArrayList<RequestQuotation> QuotList= new ArrayList<RequestQuotation>();
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
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String town = Helper.readString("Enter town > ");
		boolean found1 = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (town.equalsIgnoreCase(CustomerList.get(i).getTown())) {
				String output = String.format(
						"Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\nTown: %s\n",
						CustomerList.get(i).getName(), CustomerList.get(i).getRole(),
						CustomerList.get(i).getEmail(), CustomerList.get(i).getPassword(),
						CustomerList.get(i).getStatus(), CustomerList.get(i).getTown());
				System.out.println(output);
				found1 = true;
			}
		}
		if (found == false) {
			System.out.println("User with specific town not found!");
		}
		
		
		// Add Customer
		
		// Timorthy
		String name = Helper.readString("Enter name of user to edit > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				String email = Helper.readString("Enter new email > ");
				String password = Helper.readString("Enter new password > ");
				CustomerList.get(i).setEmail(email);
				CustomerList.get(i).setPassword(password);
				found1 = true;
			}
		}
		if (found == false) {
			System.out.println("User with specific name not found!");
		} else {
			System.out.println("User account updated");
		}
		
		// View Customer
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
				String name = Helper.readString("Enter your name > ");
				String role = Helper.readString("Enter your role > ");
				String email = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter your password > ");
				String status = Helper.readString("Enter your status > ");
				String town = Helper.readString("Enter your town > ");
				CustomerList.add(new Customer(name, role, email, password, status, town));
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
		
