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

		rq1 = new RequestQuotation("HDB", 100, 999, "123@gmail.com", 100.1, null, "Whole house", "modern", "none" );
		rq2 = new RequestQuotation("HDB", 200, 888, "456@gmail.com", 200.1, null, "Living room", "old", "none" );
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
		
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Request Quotation arraylist to add to", QuotList);

		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addRequestQuotation(QuotList, rq1);		
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());
		assertSame("Test that Request Quotation is added", rq1, QuotList.get(0));

		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());
		assertSame("Test that Request Quotation is added", p2, QuotList.get(1));
	}
	
	//Cheng Han
	public void ViewRequestQuotationTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

		//test if the list of packages retrieved from the SourceCentre is empty - boundary
		String allRequestQuotation= C206_CaseStudy.ViewRequestQuotation(QuotList);
		String testOutput = "";
		assertEquals("Check that ViewAllRequestQuotationList", testOutput, allRequestQuotation);

		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);
		assertEquals("Test that Request Quotation arraylist size is 2", 2, QuotList.size());

		//test if the expected output string same as the list of package retrieved from the SourceCentre	
		allRequestQuotation= C206_CaseStudy.ViewRequestQuotation(QuotList);
		testOutput = String.format("%-15s %-10s %-10d %-20s %-10s %-15s %-15s %-15s %-15s", "HDB", "100", "999", "123@gmail.com", "100.1", "null", "Whole house", "modern", "none");
		testOutput += String.format("%-15s %-10s %-10s %-20s %-10s %-15s %-15s %-15s %-15s","HDB", "200", "888", "456@gmail.com", "200.1", "null", "Living room", "old", "none" );

		assertEquals("Test that ViewAllRequestQuotation", testOutput, allRequestQuotation);

	}


	//Cheng Han

	public void DeleteRequestQuotationTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Request Quotation arraylist to retrieve item", QuotList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1 - normal
		C206_CaseStudy.addRequestQuotation(QuotList, rq1);
		C206_CaseStudy.addRequestQuotation(QuotList, rq2);

		//Test if the package is gone when i delete it

		C206_CaseStudy.DeleteRequestQuotation(QuotList);
		assertEquals("Test that Request Quotation arraylist size is 1", 1, QuotList.size());

	}

}
