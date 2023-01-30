public class SilverPlan extends HealthInsurancePlan {
   
   public double computeMonthlyPremium(double salary)
      {
          double pay=salary*0.06;
          return pay;
      }
}