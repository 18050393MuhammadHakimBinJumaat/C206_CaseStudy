import java.util.ArrayList;

//Timorthy
public class DeleteCustomer {
	public static void main(String[] args) {
		int option = 3;
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String name = Helper.readString("Enter name > ");
		boolean found = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				CustomerList.remove(i);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("Name not found!");
		}
	}
}