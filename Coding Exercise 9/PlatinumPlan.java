public class PlatinumPlan extends HealthInsurancePlan {

	public double computeMonthlyPremium(double salary,int age ,boolean smoking)
	{
		double pay=salary*0.08;
		if(age>55)
		pay+=200;
		if(smoking)
		pay+=100;
		return pay;
	}
}