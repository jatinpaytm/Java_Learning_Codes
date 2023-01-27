public class Billing {
   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        //double val=patientInsurancePlan.getCoverage();
        double pati=0;
        double comp=0;
        if(patientInsurancePlan instanceof PlatinumPlan)
        {
            comp=0.9*amount;
            pati=amount-comp-50.0;
            System.out.println("PlatinumPlan");
        }
        else if(patientInsurancePlan instanceof GoldPlan)
        {
            comp=0.8*amount ;
            pati=amount-comp- 40.0;
            System.out.println("GoldPlan");
        }
        else if(patientInsurancePlan instanceof SilverPlan)
        {
            comp=0.7*amount ;
            pati=amount-comp- 30.0;
            System.out.println("silverPlan");
        }
        else if(patientInsurancePlan instanceof BronzePlan)
        {
            comp=0.6*amount ;
            pati=amount-comp- 25.0;
            System.out.println("BronzePlan");
        }
        else
        {
            comp=0.0;
            pati=amount-20.0;
            System.out.println("NormalPlan");
        }
        
        // The below code will not work if we uncomment all things in the package
        // Learn why it will not work .. if you get time
        // if(val==0.9)
        // {
        //     comp=0.9*amount + 50.0;
        //     pati=amount-comp;
        // }
        // else if(val==0.8)
        // {
        //     comp=0.8*amount + 40.0;
        //     pati=amount-comp;
        // }
        // else if(val==0.7)
        // {
        //     comp=0.7*amount + 30.0;
        //     pati=amount-comp;
        // }
        // else if(val==0.6)
        // {
        //     comp=0.6*amount + 25.0;
        //     pati=amount-comp;
        // }
        // else
        // {
        //     comp=20.0;
        //     pati=amount-20.0;
        // }
        payments[0]=comp;
        payments[1]=pati;
        //System.out.println(val);
        System.out.println(comp);
        System.out.println(pati);
        // your logic        

        return payments;
    }

}