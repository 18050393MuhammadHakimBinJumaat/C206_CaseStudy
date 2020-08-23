/**
 * I declare that this code was written by me
  * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
 * 19014273, 23 Aug 2020 12:46:55 pm

 */

/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*19014273, 23 Aug 2020 12:46:55 pm
 */
//Cheng Han
public class AddRequestQuotation {
	// Item list is not null, so that can add a new item - boundary
		

			//Given an empty list, after adding 1 item, the size of the list is 1 - normal
			//The item just added is as same as the first item of the list
			C206_CaseStudy.addRequestQuotation(requestquotationList, rq1);		
			assertEquals("Test that Request Quotation arraylist size is 1", 1, requestquotationList.size());
			assertSame("Test that Request Quotation is added", rq1, requestquotationList.get(0));

			//Add another item. test The size of the list is 2? - normal
			//The item just added is as same as the second item of the list
			C206_CaseStudy.addRequestQuotation(requestquotationList, rq2);
			assertEquals("Test that Request Quotation arraylist size is 2", 2, requestquotationList.size());
			assertSame("Test that Request Quotation is added", p2, requestquotationList.get(1));
		}


