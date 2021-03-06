import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C206_CaseStudyTest {
	
	private ArrayList<Package> packageList;
	private ArrayList<RequestQuotation> QuotList;
	private Package p1;
	private Package p2;


	private ArrayList<Customer> userCustList;
	private Customer j1;
	
	
	private ArrayList<Quotation> manageQuotationList;
	private Quotation q1;

	private RequestQuotation rq1;
	private RequestQuotation rq2;


	private Appointment a1;
	private Appointment a2;
	private Appointment a3;
	private Appointment a4;//today's appointment
	private ArrayList<Appointment> appointmentList;
	private static final DateTimeFormatter date_format = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter time_format = DateTimeFormatter.ofPattern("H:mm");

	@Before
	public void setUp() throws Exception {


		packageList= new ArrayList<Package>();

	
		manageQuotationList = new ArrayList<Quotation>();

		userCustList = new ArrayList<Customer>();

		QuotList = new ArrayList<RequestQuotation>();

<<<<<<< HEAD
		p1 = new Package(1 , "Package Number 1" , null , null , 100.50);
		p2 = new Package(2 , "Package Number 2" , null , null , 10.50);

		q1 = new Quotation(1, 1, "test", "test", "test", "test", 5);

		j1 = new Customer("NAME", "ROLE", "EMAIL", "PASSWORD", "STATUS");

		rq1 = new RequestQuotation("HDB", 100, 999, "123@gmail.com", 100.1, null, "Whole house", "modern", "none" );
		rq2 = new RequestQuotation("HDB", 200, 888, "456@gmail.com", 200.1, null, "Living room", "old", "none" );

		
		LocalDate localDate1 = LocalDate.parse("20/08/2021", date_format);
		LocalTime localtime1 = LocalTime.parse("20:00", time_format);
		
		
		LocalDate localDate2 = LocalDate.parse("24/08/2021", date_format);
		LocalTime localtime2 = LocalTime.parse("15:00", time_format);
		
	
		LocalDate localDate3 = LocalDate.parse("24/08/2019", date_format);
		LocalTime localtime3 = LocalTime.parse("15:00", time_format);
		
	
		LocalTime localtime4 = LocalTime.parse("15:00", time_format);
		
	
		a1 = new Appointment(localDate1, localtime1, "Tim", "Address1", "Customer1");
		a2 = new Appointment(localDate2, localtime2, "Tom", "Address2", "Customer2");
		a3 = new Appointment(localDate3, localtime3, "Jason", "Address3", "Customer3");
		a4 = new Appointment(LocalDate.now(), localtime4, "Andrew", "Address4", "Customer4");
		
		
		appointmentList = new ArrayList<Appointment>();

	}
      //salma
	@Test
	public void addAppointmentTest() {
		
		// appointment list is not null, so that can add a new appointment
		assertNotNull("Test if there is valid Appointment arraylist to add to", appointmentList);

		// Given an empty list, after adding 1 appointment, the size of the list is 1
		C206_CaseStudy.addAppointment(appointmentList, a1);
		assertEquals("Test if that Appointment arraylist size is 1?", 1, appointmentList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that the and Appointment is added same as 1st item of the list?", a1, appointmentList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addAppointment(appointmentList, a2);
		assertEquals("Test Appointment arraylist size is 2?", 2, appointmentList.size());
	}

	@Test
	public void removeAppointmentTest() {
		
		// Add an appointment into the list and remove it, the size of the list should be 0
		C206_CaseStudy.addAppointment(appointmentList, a2);
		C206_CaseStudy.removeAppointment(appointmentList, a2,"Customer2");
		assertEquals("Test Appointment arraylist size is 0?", 0, appointmentList.size());

		// Add 2 appointment into the list and remove it, the size of the list should be 1
		C206_CaseStudy.addAppointment(appointmentList, a1);
		C206_CaseStudy.addAppointment(appointmentList, a2);
		C206_CaseStudy.removeAppointment(appointmentList, a2,"Customer2");
		assertEquals("Test Appointment arraylist size is 1?", 1, appointmentList.size());

		// If the customer enter their name worngly, they should not be able to remove an item, the size of the list will still be 1
		C206_CaseStudy.addAppointment(appointmentList, a2);
		C206_CaseStudy.removeAppointment(appointmentList, a2,"Customer1");
		assertEquals("Test Appointment arraylist size is 1?", 1, appointmentList.size());

	}

	@Test
	public void viewAppointmentTest() {
		
		// Test the appointment list is null if we have not added anything 
		assertNotNull("Test if there is valid Camcorder arraylist to add to", appointmentList);
		String allAppointment = C206_CaseStudy.retrieveAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Check that ViewAllAppointment", testOutput, allAppointment);

		// Test that the appointment list is not null if we made appointment
		C206_CaseStudy.addAppointment(appointmentList, a2);
		allAppointment = C206_CaseStudy.retrieveAllAppointment(appointmentList);
		testOutput += String.format("%-10s %-30s %-30s %-30s %-20s\n", "2021-08-24", "15:00",
				"Tom", "Address2","Customer2");
		assertEquals("Check that ViewAllAppointment", testOutput, allAppointment);

		// Test that we can view 3 appointment if we add 2 more appointment
		C206_CaseStudy.addAppointment(appointmentList, a1);
		C206_CaseStudy.addAppointment(appointmentList, a2);
		allAppointment = C206_CaseStudy.retrieveAllAppointment(appointmentList);
		testOutput += String.format("%-10s %-30s %-30s %-30s %-20s\n", "2021-08-20", "20:00",
				"Tim", "Address1","Customer1");
		testOutput += String.format("%-10s %-30s %-30s %-30s %-20s\n", "2021-08-24", "15:00",
				"Tom", "Address2","Customer2");
		assertEquals("Check that ViewAllAppointment", testOutput, allAppointment);

	}

	@Test
	public void UpdateAppointmentTest() {
		
		// Item list is not null, so that can update an appointment
		assertNotNull("Test if there is valid Appointment arraylist to update", appointmentList);

		// Check that if customer can update his/her appointment
		LocalDate currentDate = LocalDate.now();
		C206_CaseStudy.addAppointment(appointmentList, a1);
		boolean isAble = C206_CaseStudy.isAbleUpdate(appointmentList, a1,"Customer1",currentDate);
		assertEquals(true, isAble);
		C206_CaseStudy.removeAppointment(appointmentList, a1,"Customer1");

		// Change must be at least 1 day before the appointment date, if not customer is not able to change
		C206_CaseStudy.addAppointment(appointmentList, a4);
		boolean isAbleWithCurrentDate = C206_CaseStudy.isAbleUpdate(appointmentList, a4,"Customer4",currentDate);
		assertEquals(false, isAbleWithCurrentDate);
		C206_CaseStudy.removeAppointment(appointmentList, a4,"Customer4");

		// If the appointment date is passed, the customer is not able to change
		C206_CaseStudy.addAppointment(appointmentList, a3);
		boolean isAbleWithExpired = C206_CaseStudy.isAbleUpdate(appointmentList, a3,"Customer3",currentDate);
		assertEquals(false, isAbleWithExpired);
		C206_CaseStudy.removeAppointment(appointmentList, a3,"Customer3");

		// The customer is not able to change with the worng customer name entered
		C206_CaseStudy.addAppointment(appointmentList, a1);
		boolean wrongName = C206_CaseStudy.isAbleUpdate(appointmentList, a1,"Customer2",currentDate);
		assertEquals(false, wrongName);
		C206_CaseStudy.removeAppointment(appointmentList, a1,"Customer1");
	}



	@After
	public void tearDown() throws Exception {
	
		a1 = null;
		a2 = null;
		a3 = null;
		appointmentList = null;

	
		q1 = null;
		manageQuotationList = null;

	
		j1 = null;
		userCustList = null;
	}

	@Test
	public void c206_test() {

		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);



		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);

	}


//Hakim
	@Test
	public void addPackageTest() {
		
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid package arraylist to add to", packageList);

		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addPackage(packageList, p1);		
		assertEquals("Test that Package arraylist size is 1", 1, packageList.size());
		assertSame("Test that Package is added", p1, packageList.get(0));

		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPackage(packageList, p2);
		assertEquals("Test that Package arraylist size is 2", 2, packageList.size());
		assertSame("Test that Package is added", p2, packageList.get(1));
	}

//Hakim
	@Test
	public void retrievePackageTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Package arraylist to retrieve item", packageList);

		//test if the list of packages retrieved from the SourceCentre is empty - boundary
		String allPackage= C206_CaseStudy.retrieveAllPackage(packageList);
		String testOutput = "";
		assertEquals("Check that ViewAllPackagelist", testOutput, allPackage);

		//Given an empty list, after adding 1 items, test if the size of the list is 2 - normal
		addPackageTest();
		assertEquals("Test that Package arraylist size is 2", 2, packageList.size());

		//test if the expected output string same as the list of package retrieved from the SourceCentre	
		allPackage= C206_CaseStudy.retrieveAllPackage(packageList);
		testOutput = String.format("%-10d %-30s %-15s %-15s $%-15.2f \n",1,"Package Number 1",null,null,100.50);
		testOutput += String.format("%-10d %-30s %-15s %-15s $%-15.2f \n",2,"Package Number 2",null,null,10.50);

		assertEquals("Test that ViewAllPackage", testOutput, C206_CaseStudy.retrieveAllPackage(packageList));

	}
	
//Hakim
	@Test
	public void updatePackageTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Package arraylist to retrieve item", packageList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1 - normal
		C206_CaseStudy.addPackage(packageList, p1);


		// Update one of the package's information
		packageList.get(0).setDescription("This is updated Package Number 1");
		packageList.get(0).setAmount(400);

		//Test if the expected output string is the updated list of package in the SourceCentre
		String allPackage= C206_CaseStudy.retrieveAllPackage(packageList);
		String testOutput = String.format("%-10d %-30s %-15s %-15s $%-15.2f \n",1, "This is updated Package Number 1",null, null, 400.00);

		assertEquals("Test that updatePackage", testOutput, allPackage);
	}
 //Hakim
	@Test
	public void deletePackageTest() {
		
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Package arraylist to retrieve item", packageList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1 - normal
		C206_CaseStudy.addPackage(packageList, p1);
		C206_CaseStudy.addPackage(packageList, p2);

		//Test if the package is gone when i delete it

		C206_CaseStudy.deletePackage(packageList,1);
		assertEquals("Test that Package arraylist size is 1", 1, packageList.size());

	}
=======
>>>>>>> branch 'master' of https://github.com/18050393MuhammadHakimBinJumaat/C206_CaseStudy.git
	

	@Test
	//Cheng han
	public void addRequestQuotation() {
		

		assertNotNull("Test if there is valid Request Quotation arraylist to add to", QuotList);


		C206_CaseStudy.addRequestQuotation(QuotList, rq1);		
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());
		assertSame("Test that Request Quotation is added", rq1, QuotList.get(0));

	
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());
		assertSame("Test that Request Quotation is added", rq2, QuotList.get(1));
	}



	@Test
	// Cheng Han
	public void retrieveRequestQuotationTest() {
		
	
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

	
		String allRequestQuotation= C206_CaseStudy.viewAllRequestQuotation(QuotList);
		String testOutput = "";
		assertEquals("Check that ViewAllRequestQuotationList", testOutput, allRequestQuotation);

		
		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());

	
		allRequestQuotation= C206_CaseStudy.viewAllRequestQuotation(QuotList);
		testOutput = String.format("%-15s %-10.2f %-10d %-20s %-10.2f %-15s %-15s %-15s %-15s\n", "HDB", 100.00, 999, "123@gmail.com", 100.1, null, "Whole house", "modern", "none");
		testOutput += String.format("%-15s %-10.2f %-10d %-20s %-10.2f %-15s %-15s %-15s %-15s\n","HDB", 200.00, 888, "456@gmail.com", 200.1, null, "Living room", "old", "none" );

		assertEquals("Test that ViewAllRequestQuotation", testOutput, allRequestQuotation);
	}

// Cheng Han

	public void deleteRequestQuotationTest() {
		
		
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);


		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		

	
		C206_CaseStudy.deleteRequestQuotation(QuotList,1);
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());

	}
	//Sprint 2
	
	//Cheng Han
	public void updateRequestQuotationTest() {
     
        assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

       
        C206_CaseStudy.addRequestQuotation(QuotList, rq1);


     
        QuotList.get(0).setBudget(300.00);

 
        String allRequestQuotation= C206_CaseStudy.viewAllRequestQuotation(QuotList);
        String testOutput = String.format("%-10d %-15s %-10.2f %-10d %-20s %-10.2f %-15s %-15s %-15s %-15s\n",1,"HDB", 100.00, 999, "123@gmail.com", 300.00, null, "Whole house", "modern", "none" );

        assertEquals("Test that updateRequestQuotation", testOutput, allRequestQuotation);
    }
}


	