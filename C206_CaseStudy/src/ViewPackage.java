import java.util.ArrayList;

public class ViewPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> PackageList = new ArrayList<Package>();
		for (Package p : PackageList) {
			String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nPEndDate: %s\n: %s\n Town%s\n",
					p.get(), c.getRole(), c.getEmail(), c.getPassword(), c.getStatus(), c.getTown());
			System.out.println(output);
		}
	}

}
