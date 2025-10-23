import java.util.Scanner;
public class task01{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Testing isPrime
        System.out.println("isPrime(7): " + isPrime(7));
        System.out.println("isPrime(15): " + isPrime(15));
        // Testing isPerfect
        System.out.println("isPerfect(6): " + isPerfect(6));
        System.out.println("isPerfect(33): " + isPerfect(33));
        // Testing special_sum
        int result = special_sum(num);
        System.out.println("special_sum(" + num + "): " + result);
    }
    
    public static void isPrime(){
        
    }
}