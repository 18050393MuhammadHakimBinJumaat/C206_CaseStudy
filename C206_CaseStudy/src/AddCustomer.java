//Timorthy
import java.util.ArrayList;

public class AddCustomer {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		while (option != 7) {
			System.out.println("=========================");
			System.out.println("1. Add User Account");
			System.out.println("2. View All User");
			System.out.println("3. Delete user by name");
			System.out.println("4. Search user by town");
			System.out.println("5. Edit user account");
			System.out.println("6. User Login");
			System.out.println("7. Exit");
			option = Helper.readInt("Choose an option > ");
			System.out.println("=========================");
			if (option == 1) {
				String name = Helper.readString("Enter your name > ");
				String role = Helper.readString("Enter your role > ");
				String email = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter your password > ");
				String status = Helper.readString("Enter your status > ");
				String town = Helper.readString("Enter your town > ");
				CustomerList.add(new Customer(name, role, email, password, status, town));
				/*
				 * } else if (option == 2) { for (ManageCustomer c : CustomerList) { String
				 * output = String.
				 * format("Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\n Town%s\n",
				 * c.getName(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(),
				 * c.getTown()); System.out.println(output); } } else if (option == 3) { String
				 * name = Helper.readString("Enter name > "); boolean found = false; for (int i
				 * = 0; i < CustomerList.size(); i++) { if
				 * (name.equalsIgnoreCase(CustomerList.get(i).getName())) {
				 * CustomerList.remove(i); found = true; } } if (found == false) {
				 * System.out.println("Name not found!"); } } else if (option == 4) { String
				 * town = Helper.readString("Enter town > "); boolean found = false; for (int i
				 * = 0; i < CustomerList.size(); i++) { if
				 * (town.equalsIgnoreCase(CustomerList.get(i).getTown())) { String output =
				 * String.format(
				 * "Name: %s\nRole: %s\nEmail: %s\nPassword: %s\nStatus: %s\nTown: %s\n",
				 * CustomerList.get(i).getName(), CustomerList.get(i).getRole(),
				 * CustomerList.get(i).getEmail(), CustomerList.get(i).getPassword(),
				 * CustomerList.get(i).getStatus(), CustomerList.get(i).getTown());
				 * System.out.println(output); found = true; } } if (found == false) {
				 * System.out.println("User with specific town not found!"); } } else if (option
				 * == 5) { String name = Helper.readString("Enter name of user to edit > ");
				 * boolean found = false; for (int i = 0; i < CustomerList.size(); i++) { if
				 * (name.equalsIgnoreCase(CustomerList.get(i).getName())) { String email =
				 * Helper.readString("Enter new email > "); String password =
				 * Helper.readString("Enter new password > ");
				 * CustomerList.get(i).setEmail(email);
				 * CustomerList.get(i).setPassword(password); found = true; } } if (found ==
				 * false) { System.out.println("User with specific name not found!"); } else {
				 * System.out.println("User account updated"); } } else if (option == 6) {
				 * String email = Helper.readString("Enter email > "); String password =
				 * Helper.readString("Enter password > "); boolean success = false; for (int i =
				 * 0; i < CustomerList.size(); i++) { if (CustomerList.get(i).isBlocked()) { if
				 * (email.equalsIgnoreCase(CustomerList.get(i).getEmail())) { if
				 * (password.equalsIgnoreCase(CustomerList.get(i).getPassword())) { success =
				 * true; } else {
				 * CustomerList.get(i).setAttempts(CustomerList.get(i).getAttempts() + 1); if
				 * (CustomerList.get(i).getAttempts() > 3) {
				 * CustomerList.get(i).setBlocked(true);
				 * System.out.println("User is blocked from too many attempts!"); } }
				 * System.out.println("Wrong Password!"); } if (success) {
				 * System.out.println("Logged in!"); } } else {
				 * System.out.println("User is blocked from too many attempts!"); } }
				 */
			}
		}
	}

}
