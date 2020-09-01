import java.time.LocalDate;

/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*18050393, 22 Aug 2020 11:28:10 am
 */
//Hakim
public class Package {
	private String addPackage ;
	private String viewPackage;
	private String deletePackage;
	private String updatePackage;
	private String Code;
	private String Description;
	private String StartDate;
	private String EndDate;
	private String PackageAmount;
	
	

	
	
	public void setUpdatePackage(String updatePackage) {
		this.updatePackage = updatePackage;
	}
	public void setCode(String code) {
		Code = code;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public void setPackageAmount(String packageAmount) {
		PackageAmount = packageAmount;
	}
	public String getUpdatePackage() {
		return updatePackage;
	}
	public String getCode() {
		return Code;
	}
	public String getDescription() {
		return Description;
	}
	public String getStartDate() {
		return StartDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public String getPackageAmount() {
		return PackageAmount;
	}
	public Package(String addPackage, String viewPackage, String deletePackage, String updatePackage) {
		super();
		this.addPackage = addPackage;
		this.viewPackage = viewPackage;
		this.deletePackage = deletePackage;
		this.updatePackage = updatePackage;
	}
	public Package(int i, String string, Object object, Object object2, double d) {
		// TODO Auto-generated constructor stub
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


	/**
	 * @return
	 */
	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return
	 */
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return
	 */
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return
	 */
	public Object getRole() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return
	 */
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return
	 */
	public Object getTown() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setAmount(int i) {
		// TODO Auto-generated method stub
		
	}
}
