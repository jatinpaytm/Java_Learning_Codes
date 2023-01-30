// 2nd code of how to use abstract classes
abstract public class HealthInsurancePlan {
    
    abstract public double computeMonthlyPremium(double salary,int age ,boolean smoking);
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
}