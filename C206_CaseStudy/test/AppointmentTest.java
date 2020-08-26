
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19027922, 18 Aug 2020 11:42:44 am
 */
//salma
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentTest {
      private static final LocalDate AppointmentList1 = null;
	private String customerName;
      private String designerName;
      private LocalDateTime appointmentDateTime;
      private LocalDate appointmentDate;
      
    private Appointment ap1;
  	private Appointment ap2;
  	
  	
  	private ArrayList<Appointment> AppointmentList;
  	
  	public AppointmentTest() {
  		super();
  	}
  	
  	@Before
  	public void setUp() throws Exception {
  		// prepare test data
  		//ap1 = new Appointment("Hakim", "Wen Qong" ,2020-10-8,);
  		//ap2 = new Appointment("Hakim", "Wen Qong" ,2020-11-10 ,);
  	

  		AppointmentList= new ArrayList<Appointment>();
  		
  	}
  	@Test
	public void addAppointmentTest() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Appointment arraylist to add to", AppointmentList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		AppointmentTest.addAppointment(AppointmentList, ap1);		
		assertEquals("Test if that Appointment arraylist size is 1?", 1, AppointmentList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Appointment is added same as 1st appontment of the list?", ap1, AppointmentList.get(0));
		
		//Add another item. test The size of the list is 2?
		AppointmentTest.addAppointment(AppointmentList, ap2);
		assertEquals("Test that Appointment arraylist size is 2?", 2, AppointmentList.size());
	}
//salma
	/**
	 * @param appointmentList2
	 * @param ap12
	 */
  	private static void addAppointment(ArrayList<Appointment> appointmentList2, Appointment ap12) {
		// TODO Auto-generated method stub
		
  		
  		public static viewAppointment() {
  			// Test if Item list is not null but empty -boundary
  			assertNotNull("Test if there is valid Appointment arraylist to retrieve", AppointmentList1);
  			
  			//test if the list of Promotions retrieved from the SourceCentre is empty - boundary
  			String allAppointment= Appointment.retrieveAllAppointment(AppointmentList1);
  			String testOutput = "";
  			assertEquals("Check that ViewAllAppointmentList", testOutput, allAppointment);
  			
  			//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
  			Appointment.addPromotion(AppointmentList1, ap1);
  			Appointment.addPromotion(AppointmentList1, ap2);
  			assertEquals("Test that Appointment arraylist size is 2", 2, AppointmentList1.size());
  			
  			
  		}
  		//
  	}
	}

