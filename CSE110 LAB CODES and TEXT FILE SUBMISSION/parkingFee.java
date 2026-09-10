import java.util.Scanner;
public class parkingFee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of hour(s) you've parked: ");
        int hrs = sc.nextInt();
        int charge =0;
        if(hrs<=5){
            charge = hrs*15;
        }
        else if(hrs==6 || hrs<=10){
            charge = hrs*30;
        }
        else if(hrs==11 || hrs<=15){
            charge = hrs*60;
        }
        else if(hrs==16 || hrs<=40){
            charge = hrs*90;
        }
        else{
            System.out.println("Parking is not allowed for more than 40 hours! ");
        }
        
   //-----Discount------//
        double dis =0;
        if(charge==350 || charge<=900){
            dis = charge*0.09;
        }
        else if(charge>900){
            dis = charge*0.15;
        }
        System.out.println("Amount charged :"+ charge);
        System.out.println("Discount :"+ dis);
        System.out.println("Payable fee :"+ (charge-dis));
        
    }
}