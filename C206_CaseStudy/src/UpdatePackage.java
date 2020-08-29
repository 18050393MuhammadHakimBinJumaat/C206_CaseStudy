import java.time.LocalDate;
import java.util.ArrayList;

//Hakim
public class UpdatePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Package> PackageList = new ArrayList<Package>();
		String enterDate = Helper.readString("Enter start date: ");
		boolean found = false;
		for (int i = 0; i < PackageList.size(); i++) {
			if (enterDate.equalsIgnoreCase(PackageList.get(i).getDate())) {
				String newDate = Helper.readString("Enter new date : ");
				PackageList.get(i).setAddPackage(enterDate);
				PackageList.get(i).setAddPackage(newDate);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("Customer has input invlaid date");
		} else {
			System.out.println("Package successfully Updated");
		}
	}

}
