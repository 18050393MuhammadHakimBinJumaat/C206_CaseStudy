import java.util.ArrayList;
//Timorthy
public class UpdateCustomer {
	
public static void main(String[] args) {
	
	ArrayList<Customer> CustomerList = new ArrayList<Customer>();
	String name = Helper.readString("Enter name of user to edit > ");
	boolean found = false;
	for (int i = 0; i < CustomerList.size(); i++) {
		if (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
			String email = Helper.readString("Enter new email > ");
			String password = Helper.readString("Enter new password > ");
			CustomerList.get(i).setEmail(email);
			CustomerList.get(i).setPassword(password);
			found = true;
		}
	}
	if (found == false) {
		System.out.println("User with specific name not found!");
	} else {
		System.out.println("User account updated");
	}
}
}
