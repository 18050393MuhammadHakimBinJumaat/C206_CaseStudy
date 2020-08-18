
/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*18050393, 18 Aug 2020 11:28:10 am
 */
//Hakim
public class ManagePackage {
	private String addPackage ;
	private String viewPackage;
	private String deletePackage;
	public ManagePackage(String addPackage, String viewPackage, String deletePackage) {
		super();
		this.addPackage = addPackage;
		this.viewPackage = viewPackage;
		this.deletePackage = deletePackage;
	}
	public String getAddPackage() {
		return addPackage;
	}
	public String getViewPackage() {
		return viewPackage;
	}
	public String getDeletePackage() {
		return deletePackage;
	}
	public void setAddPackage(String addPackage) {
		this.addPackage = addPackage;
	}
	public void setViewPackage(String viewPackage) {
		this.viewPackage = viewPackage;
	}
	public void setDeletePackage(String deletePackage) {
		this.deletePackage = deletePackage;
	}
	
	

}
