public class HealthInsurancePlan {
    // Code for 'coverage' field goes here
    protected double coverage;
    public double getCoverage()
    {
        return coverage;
    }
    
    public void setCoverage()
    {
        //this.coverage=0.5;
    }
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
}