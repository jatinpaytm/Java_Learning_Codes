public class PlatinumPlan extends HealthInsurancePlan {

	public double computeMonthlyPremium(double salary)
	{
		double pay=salary*0.08;
		return pay;
	}
}