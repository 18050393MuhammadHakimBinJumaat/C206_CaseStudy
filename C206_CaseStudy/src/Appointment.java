import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 20 Aug 2020 9:27:07 pm
 */

public class Appointment {
	
		 private String CustomerName;
	     private String designerName;
	     private LocalDateTime appointmentTime;
	     private LocalDate appointmentDate;
	     
	     
	     public Appointment(String CustomerName, String designerName, LocalDate appointmentDate, LocalDateTime appointmentTime) {
	     this.CustomerName = CustomerName;
	     this.designerName = designerName;
	     this.appointmentDate = appointmentDate;
	     this.appointmentTime = appointmentTime;
	     }
	     /**
		 * @param localDate3
		 * @param localtime3
		 * @param designerName2
		 * @param address
		 * @param customerName2
		 */
		public Appointment(LocalDate localDate3, LocalTime localtime3, String designerName2, String address,
				String customerName2) {
			// TODO Auto-generated constructor stub
		}
		public String 
	     getcustomerName() {
	    	 return CustomerName;
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
	     setCustomerName(String CustomerName) {
	    	 this.CustomerName = CustomerName;
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
	    	  System.out.println("The customer: "+ CustomerName);
	    	  System.out.println("has an appointment on :"+ appointmentDate);
	    	  System.out.println("Appointment Time:"+ appointmentTime);
	    	  System.out.println("With the designer:" + designerName);
	     }//salma
					
		
		
		 
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		 * @return
		 */
		/**
		 * @param appointmentlist1
		 * @return
		 */
		public static String retrieveAllAppointment(LocalDate appointmentlist1) {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		 * @param address
		 */
		public void setAddress(String address) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * @param localDate1
		 */
		public void setDateOfAppointment(LocalDate localDate1) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * @param localtime2
		 */
		public void setTimeOfAppointment(LocalTime localtime2) {
			// TODO Auto-generated method stub
			
		}
	
		
					
		}
		
			
		
	



