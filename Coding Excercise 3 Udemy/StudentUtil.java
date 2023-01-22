public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] grades=new double[studentIdList.length];
        
        for(int i=0;i<studentIdList.length;i++)
        {
            double gpa=0;
            
            for(char x:studentsGrades[i])
            {
                if(x=='A')
                gpa+=4.0;
                if(x=='B')
                gpa+=3.0;
                if(x=='C')
                gpa+=2.0;
            }
            double n=studentsGrades[i].length;
            
            gpa=gpa/n;
            grades[i]=gpa;
        }
        return grades;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        
        
        if(lower>higher || lower<0 || higher<0)
        return null;
        
        double[] grades=calculateGPA(studentIdList,studentsGrades);
        
        
        int n=studentIdList.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(grades[i]>=lower && grades[i]<=higher)
            cnt++;
        }
        int[] ans=new int[cnt];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(grades[i]>=lower && grades[i]<=higher)
            {
                ans[j++]=studentIdList[i];
            }
            
        }
        return ans;
        // perform parameter validation. Return null if passed parameters are not valid
        
        // invoke calculateGPA
        
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
    }
    
}