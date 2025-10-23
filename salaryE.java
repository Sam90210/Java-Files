import java.util.Scanner;
public class salaryE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Karim's salary:");
        double x = sc.nextInt();
        double bonusd = x+(x*3/4);
        System.out.println("Total salary with bonus: "+ bonusd);;
        double wifeBudget = x*0.45;
        System.out.println("Wife budget: "+wifeBudget);
        double sonBudget = x*0.45;
        System.out.println("Son budget: "+sonBudget);
        double savings = x*0.10;
        System.out.println("Savings: "+savings);
        
        double laptop = 90000, ps5nCon = 77000;
        
        boolean wifeDone = false, sonDone = false;
        
        if(wifeBudget>=laptop){
        System.out.println("Shopping done for wife!");
        wifeDone =true;
        }
        else if(!wifeDone && wifeBudget+sonBudget-ps5nCon >= laptop){
        System.out.println("Done shopping for wife even with reamining money from son's budget");
        }
        else{
        System.out.println("Shopping cant be done for his wife with the remaining money from his son's budget");
        }
        
        if(sonBudget>=ps5nCon){
        System.out.println("Shopping done for son!");
        sonDone=true;
        }
        else if(!sonDone && sonBudget+wifeBudget - laptop >=ps5nCon){
        System.out.println("Done shopping for son even with reamining money from wife's budget");
        }
        else{
        System.out.println("Shopping cant be done for his son with the remaining money from his wife's budget");
        
        }
    }
}