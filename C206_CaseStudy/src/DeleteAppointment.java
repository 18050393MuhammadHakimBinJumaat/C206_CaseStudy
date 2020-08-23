import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 24 Aug 2020 1:16:30 am
 */

public class DeleteAppointment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CustomerName = Helper.readString("Enter Name of Customer for the appointment to be cancelled> ");
		
		ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
		for (int i = 0; i < AppointmentList1.size(); i++) {
				if (( AppointmentList1.get(i)).getName() == CustomerName) {
				AppointmentList1.remove(i);
				System.out.println("Appointment Cancelled Successfully");
			}
		}
	}

}
