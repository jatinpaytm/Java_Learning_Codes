public class BlueCrossBlueShield implements InsuranceBrand
{
    long id=0;
	String name="";
    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking)
    {
        // dont know what to return .. so just did this
        return 0.0;
    }
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}