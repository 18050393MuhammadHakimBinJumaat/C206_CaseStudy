import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 20 Aug 2020 9:27:07 pm
 */

public class Appointment {
	
		 private String customerName;
	     private String designerName;
	     private LocalDateTime appointmentTime;
	     private LocalDate appointmentDate;
	     
	     
	     public Appointment(String customerName, String designerName, LocalDate appointmentDate, LocalDateTime appointmentTime) {
	     this.customerName = customerName;
	     this.designerName = designerName;
	     this.appointmentDate = appointmentDate;
	     this.appointmentTime = appointmentTime;
	     }
	     public String 
	     getcustomerName() {
	    	 return customerName;
	     }
	     public String
	     getdesignerName() {
	    	 return designerName;
	     }
	     public LocalDateTime 
	    	 getappointmentTime() {
	    	 return appointmentTime;
	     }
	     public LocalDate
	        getappointmentDate() {
	    	 return appointmentDate;
	     }
	     public void
	     setCustomerName(String customerName) {
	    	 this.customerName = customerName;
	     }
	     public void
	     setDesignerName(String DesignerName) {
	    	 this.designerName = designerName;
	     }
	     public void
	     setAppointmentDate(LocalDate AppointmentDate) {
	    	 this.appointmentDate = appointmentDate;
	     }
	     public void
	     setAppointmentTime(LocalDateTime AppointmentTime) {
	    	 this.appointmentTime = appointmentTime;
	     }
	     public void 
	     showDetailsof() {
	    	  System.out.println("The customer: "+ customerName);
	    	  System.out.println("has an appointment on :"+ appointmentDate);
	    	  System.out.println("Appointment Time:"+ appointmentTime);
	    	  System.out.println("With the designer:" + designerName);
	     }//salma
	}



