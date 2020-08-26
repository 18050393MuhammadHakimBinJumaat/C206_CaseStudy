import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 24 Aug 2020 1:16:59 am
 */

public class ViewAppointment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
		for (Appointment a : AppointmentList1) {
			String output = String.format("Name: %s\nCustomerName: %s\nDesignerName\n",
					a.getcustomerName(), a.getdesignerName());
			System.out.println(output);
		}
	}

}
//salma.,