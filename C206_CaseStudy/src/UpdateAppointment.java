import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 24 Aug 2020 1:17:18 am
 */

public class UpdateAppointment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
