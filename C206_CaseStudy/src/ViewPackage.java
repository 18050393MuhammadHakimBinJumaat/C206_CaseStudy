import java.util.ArrayList;

public class ViewPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> PackageList = new ArrayList<Package>();
		for (Package p : PackageList) {
//<<<<<<< HEAD
			String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nEndDate: %s\n: %s\n Town%s\n",
					p.get(), p.getRole(), p.getEmail(), p.getPassword(), p.getStatus(), p.getTown());
//=======
			String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nPassword: %s\nStatus: %s\n Town%s\n",
					p.getName(), p.getRole(), p.getEmail(), p.getPassword(), p.getStatus(), p.getTown());
//>>>>>>> branch 'master' of https://github.com/18050393MuhammadHakimBinJumaat/C206_CaseStudy.git
			System.out.println(output);
		}
	}

}
