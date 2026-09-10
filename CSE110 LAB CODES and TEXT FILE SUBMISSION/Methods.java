import java.util.Scanner;
public class Methods{
    public static void main (String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int nth= sc.nextInt();
        boolean check1= isPrime(7);
        System.out.println(check1);
        boolean check2= isPerfect(6);
        System.out.println(check2);
        int result= special_sum(nth);//result<<
        System.out.print(result);
    }
    
    public static boolean isPrime(int num)
    {//A
        int count=0;
        boolean flag;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0){
                count++;
            }
        }
        if(count==2)
        {
            flag=true;
        }
        else{
            flag=false;   
        }
        return flag;
    }
    
    public static boolean isPerfect(int no)
    {//B
        boolean flag;
        int sum=0;
        for(int i=1;i<no;i++)
        
        {
            if(no%i==0){
                sum+=i;
            }
        }
        if(sum==no)
        {
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
   
    public static int special_sum(int num)
    {//C
        int sum=0;
        for(int j=0; j<=num; j++){
            if(isPerfect(j) || isPrime(j))
            {
                sum+=j;
            }
        }
        return sum;
    }
}
