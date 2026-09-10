import java.util.Scanner;
public class TASK03{
    public static void main(String[]args)
    {
        calcYearlyTax();
    }
    
    public static double calcTax(int age,int salary)
    {//A
        double taxt;
        if(age >= 18 && salary >= 10000)
        {
            if(salary >= 10000  && salary <= 20000)
            {
                taxt = salary*(7.0 / 100.0);
            }
            else
            { 
                taxt = salary*(14.0 / 100.0);
            }
        }
        else
        {
            taxt = 0;
        }
        return taxt;
    }
    
    public static void calcYearlyTax()
    {//B
        double arr[] = new double[12],sum=0;
        
        Scanner sc= new Scanner(System.in);
        
        int age= sc.nextInt();
        for(int i=0; i<12; i++)
        {
            int n=sc.nextInt(); 
            arr[i]= calcTax(age,n);
            sum+= arr[i];
        }
        
        for(int i=0; i<12; i++)
        {
            System.out.println("month "+(i+1)+" tax:"+arr[i]);
        }
        System.out.print("Total Yearly Tax:"+ sum);
    }
}