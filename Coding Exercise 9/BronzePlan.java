public class BronzePlan extends HealthInsurancePlan {
  
    public double computeMonthlyPremium(double salary,int age ,boolean smoking)
     {
         double pay=salary*0.05;
         if(age>55)
         pay+=50;
         if(smoking)
         pay+=70;
         return pay;
     }
 }