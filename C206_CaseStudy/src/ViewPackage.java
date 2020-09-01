import java.util.ArrayList;

public class ViewPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> PackageList = new ArrayList<Package>();
		for (Package p : PackageList) {
//<<<<<<< HEAD
			String output = String.format("Code: %s\nDescription: %s\nStartDate: %s\nEndDate: %sPackage Amount:\n",
					p.getCode(), p.getDescription(), p.getStartDate(), p.getEndDate(), p.getPackageAmount();
//=======
			
//>>>>>>> branch 'master' of https://github.com/18050393MuhammadHakimBinJumaat/C206_CaseStudy.git
			System.out.println(output);
		}
	}

}
