import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param quotList
	 */
	//Cheng Han
	public static void DeleteRequestQuotation(ArrayList<RequestQuotation> quotList) {
		int code = Helper.readInt("Enter Contact of Request Quotationto delete> ");
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		for (int i = 0; i < QuotList.size(); i++) {
			if (QuotList.get(i).getcontact() == code) {
				QuotList.remove(i);
				System.out.println("Request Quotation removed!");
			}
		}
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param quotList
	 * @return
	 */
	// Cheng Han
	public static String ViewRequestQuotation(ArrayList<RequestQuotation> quotList) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param quotList
	 * @param rq1
	 */
	public static void addRequestQuotation(ArrayList<RequestQuotation> quotList, RequestQuotation rq1) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param quotList
	 * @param rq1
	 */




}
