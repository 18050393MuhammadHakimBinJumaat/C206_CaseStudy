/**
 * I declare that this code was written by me
  * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
 * 19014273, 18 Aug 2020 10:39:10 am

 */

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 18015077, 18 Aug 2020 10:39:10 am
 */
public class ManageCustomer {
	private String name;
	private String role;
	private String email;
	private String password;
	private String status;

	public ManageCustomer(String name, String role, String email, String password, String status) {
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.status = status;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
