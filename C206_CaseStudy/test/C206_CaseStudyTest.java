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
}


	