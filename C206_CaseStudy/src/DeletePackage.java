import java.util.ArrayList;

public class DeletePackage {
//Hakim
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Package> PackageList = new ArrayList<Package>();
		String package = Helper.readString("Enter package > ");
		boolean found = false;
		for (int i = 0; i < PackageList.size(); i++) {
			if (package.equalsIgnoreCase(PackageList.get(i).getPackage()));
				found = false;
		
	}

	}}
