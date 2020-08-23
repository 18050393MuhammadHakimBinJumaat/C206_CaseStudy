import java.util.ArrayList;

//Cheng Han
public class DeleteRequestQuotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int  contactname = Helper.readInt("Enter Contact of Request Quotationto delete> ");
	
			ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
			for (int i = 0; i < QuotList.size(); i++) {
				if (QuotList.get(i).getcontact() == contactname) {
					QuotList.remove(i);
					System.out.println("Request Quotation Removed");
				}
			}
		
		}
		// TODO Auto-generated method stub

	}


