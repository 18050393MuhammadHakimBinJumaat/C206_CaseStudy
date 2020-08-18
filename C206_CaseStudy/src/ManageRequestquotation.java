import java.time.LocalDate;

/**
 * I declare that this code was written by me
  * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
 * 19014273, 18 Aug 2020 11:25:38 am

 */

/**
 * I declare that this code was written by me.
 *I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
*
*19014273, 18 Aug 2020 11:25:38 am
 */

//YEE CHENG HAN
public class ManageRequestquotation {
	private String propertyType;
	private double AreaSize;
	private int contact;
	private String email;
	private double budget;
	private LocalDate completedate;
	private String renovationType;
	private String renoStyle;
	private String srequest;
	

	public ManageRequestquotation(String propertyType, double AreaSize,int Contact,String email,double budget,
			LocalDate completedate,String renovationType,String renoStyle,String srequest){
		this.propertyType = propertyType;
		this.AreaSize = AreaSize;
		this.contact = contact;
		this.email = email;
		this.budget = budget;
		this.completedate = completedate;
		this.renovationType = renovationType;
		this.renoStyle = renoStyle;
		this.srequest = srequest;
		
	}

	public String getpropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		propertyType = propertyType;
	}

	public double getAreaSize() {
		return AreaSize;
	}

	public void setAreaSize(double areaSize) {
		areaSize = areaSize;
	}

	public int getcontact() {
		return contact;
	}

	public void setContact(int contact) {
		contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getCompletedate() {
		return completedate;
	}

	public void setCompletedate(LocalDate completedate) {
		this.completedate = completedate;
	}

	public String getRenovationType() {
		return renovationType;
	}

	public void setRenovationType(String renovationType) {
		this.renovationType = renovationType;
	}

	public String getRenoStyle() {
		return renoStyle;
	}

	public void setRenoStyle(String renoStyle) {
		this.renoStyle = renoStyle;
	}

	public String getsrequest() {
		return srequest;
	}

	public void setSRequest(String srequest) {
		srequest = srequest;
	}
	
	
}

