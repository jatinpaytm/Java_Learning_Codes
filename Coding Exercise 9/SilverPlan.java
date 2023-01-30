public class SilverPlan extends HealthInsurancePlan {
   
    public double computeMonthlyPremium(double salary,int age ,boolean smoking)
     {
         double pay=salary*0.06;
         if(age>55)
         pay+=100;
         if(smoking)
         pay+=80;
         return pay;
     }
 }