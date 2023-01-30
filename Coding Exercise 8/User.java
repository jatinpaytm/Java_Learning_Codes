public class User 
{
   private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private HealthInsurancePlan insurancePlan;
	private boolean insured;
	// add rest of the variables
	public void setInsurancePlan(HealthInsurancePlan insurancePlan)
   {
       this.insurancePlan=insurancePlan;
   }
   
   public HealthInsurancePlan getInsurancePlan()
   {
       return insurancePlan;
   }
   
    // use is instead of get
    //beacuse for bool we use is
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
    
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// add rest of the getters & setters
   
}