import java.util.ArrayList;

/**
 * I declare that this code was written by me
  * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
 * 19014273, 22 Aug 2020 8:01:02 pm

 */

/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*19014273, 22 Aug 2020 8:01:02 pm
 */
public class ViewRequestQuotation {
//ChengHan


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<RequestQuotation> QuotList = new ArrayList<RequestQuotation>();
		for (RequestQuotation c : QuotList) {
			String output = String.format("Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\n Town%s\n",
					c.getName(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(), c.getTown());
			System.out.println(output);
		// TODO Auto-generated method stub

	}

}
}
