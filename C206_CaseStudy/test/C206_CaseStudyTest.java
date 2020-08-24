import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	ArrayList<RequestQuotation> QuotList= new ArrayList<RequestQuotation>();
	private Package p1;
	private Package p2;
	private RequestQuotation rq1;
	private RequestQuotation rq2;
	@Before
	public void setUp() throws Exception {

		rq1 = new RequestQuotation("Private", 1000, 500, "abc@gmail.com", 100.1, null, "Toilet", "retro", "none" );
		rq2 = new RequestQuotation("Landed", 1000, 888, "def@gmail.com", 200.1, null, "Kitchen", "classic", "none" );
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}


	//ChengHan
	public void AddRequestQuotationTest() {
		
		
		assertNotNull("Test if there is valid Request Quotation arraylist to add to", QuotList);

		C206_CaseStudy.addRequestQuotation(QuotList, rq1);		
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());
		assertSame("Test that Request Quotation is added", rq1, QuotList.get(0));

		
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());
		assertSame("Test that Request Quotation is added", p2, QuotList.get(1));
	}
	
	//Cheng Han
	public void ViewRequestQuotationTest() {
	
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

		
		String allRequestQuotation= C206_CaseStudy.ViewRequestQuotation(QuotList);
		String testOutput = "";
		assertEquals("Check that ViewAllRequestQuotationList", testOutput, allRequestQuotation);


		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());

		
		allRequestQuotation= C206_CaseStudy.ViewRequestQuotation(QuotList);
		testOutput = String.format("%-15s %-10s %-10d %-20s %-10s %-15s %-15s %-15s %-15s", "HDB", "100", "999", "123@gmail.com", "100.1", "null", "Whole house", "modern", "none");
		testOutput += String.format("%-15s %-10s %-10s %-20s %-10s %-15s %-15s %-15s %-15s","HDB", "200", "888", "456@gmail.com", "200.1", "null", "Living room", "old", "none" );

		assertEquals("Test that ViewAllRequestQuotation", testOutput, allRequestQuotation);

	}


	//Cheng Han

	public void DeleteRequestQuotationTest() {
		
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

	
		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);

	

		C206_CaseStudy.DeleteRequestQuotation(QuotList);
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());

	}

}
