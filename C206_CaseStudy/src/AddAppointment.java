import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 24 Aug 2020 1:15:20 am
 */

public class AddAppointment {
	public static void main(String[] args, Object AppointmentList) {
		// TODO Auto-generated method stub
		
		String CustomerName = Helper.readString("Enter your Name > ");
		String designerName = Helper.readString("Enter your DesignerName > ");
		LocalDateTime appointmentTime = Helper.readLocalDateTime("Enter your appointment time");
		LocalDate appointmentDate = Helper.readLocalDate("Enter your appointment date");
Appointment ap = new Appointment(CustomerName, designerName, appointmentDate,appointmentTime);
		//
		ArrayList<Appointment> AppointmentList1 = new ArrayList<Appointment>();
		AppointmentList1.add(ap);
		System.out.println("Appointment Added");
}
	
}