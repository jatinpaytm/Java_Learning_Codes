public class GoldPlan extends HealthInsurancePlan{
	
    public double computeMonthlyPremium(double salary,int age ,boolean smoking)
	{
		double pay=salary*0.07;
		if(age>55)
		pay+=150;
		if(smoking)
		pay+=90;
		return pay;
	}
 }