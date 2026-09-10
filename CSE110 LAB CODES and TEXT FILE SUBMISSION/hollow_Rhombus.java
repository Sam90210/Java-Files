import java.util.Scanner;
public class hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            // Print numbers
            System.out.print("1");
            if(i>1) {
                for(int j=1; j<= 2*(i-1)-1; j++) {
                    System.out.print(" ");
                }
                System.out.print(2*i-1);
            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            if(i>1) {
                for(int j=1; j <= 2*(i-1)-1; j++) {
                    System.out.print(" ");
                }
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}