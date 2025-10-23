//task1
import java.util.Scanner;
public class NumChecker{
    public static void evenChecker(int num1){
        
        if(num1%2==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
        
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
             
                evenChecker(sc.nextInt());
        
    }
}