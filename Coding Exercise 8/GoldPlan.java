public class GoldPlan extends HealthInsurancePlan{
	
    public double computeMonthlyPremium(double salary)
    	{
    	    double pay=salary*0.07;
    	    return pay;
    	}
 }