import java.util.ArrayList;

public class LoginCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 6;
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");
		boolean success = false;
		for (int i = 0; i < CustomerList.size(); i++) {
			if (CustomerList.get(i).isBlocked()) {
				if (email.equalsIgnoreCase(CustomerList.get(i).getEmail())) {
					if (password.equalsIgnoreCase(CustomerList.get(i).getPassword())) {
						success = true;
					} else {
						CustomerList.get(i).setAttempts(CustomerList.get(i).getAttempts() + 1);
						if (CustomerList.get(i).getAttempts() > 3) {
							CustomerList.get(i).setBlocked(true);
							System.out.println("User is blocked from too many attempts!");
						}
					}
					System.out.println("Wrong Password!");
				}
				if (success) {
					System.out.println("Logged in!");
				}
			} else {
				System.out.println("User is blocked from too many attempts!");
			}
		}
	}

}
