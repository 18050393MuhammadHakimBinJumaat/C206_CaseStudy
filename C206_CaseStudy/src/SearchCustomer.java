import java.util.ArrayList;

public class SearchCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 4;
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String town = Helper.readString("Enter town > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (town.equalsIgnoreCase(CustomerList.get(i).getTown())) {
				String output = String.format(
						"Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\nTown: %s\n",
						CustomerList.get(i).getName(), CustomerList.get(i).getRole(),
						CustomerList.get(i).getEmail(), CustomerList.get(i).getPassword(),
						CustomerList.get(i).getStatus(), CustomerList.get(i).getTown());
				System.out.println(output);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("User with specific town not found!");
		}
	}

}
