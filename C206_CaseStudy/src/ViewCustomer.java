import java.util.ArrayList;

//Timorthy
public class ViewCustomer {
	
	public static void main(String[] args) {
		
	
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		for (Customer c : CustomerList) {
			String output = String.format("Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\n Town%s\n",
					c.getName(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(), c.getTown());
			System.out.println(output);
		}
	}
}