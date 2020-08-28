import java.util.ArrayList;

public class ViewPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> PackageList = new ArrayList<Package>();
		for (Package p : PackageList) {
			String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nPassword: %s\nStatus: %s\n Town%s\n",
					p.getName(), p.getRole(), p.getEmail(), p.getPassword(), p.getStatus(), p.getTown());
			System.out.println(output);
		}
	}

}
