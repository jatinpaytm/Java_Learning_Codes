public class BronzePlan extends HealthInsurancePlan {
  
   public double computeMonthlyPremium(double salary)
      {
          double pay=salary*0.05;
          return pay;
      }
}