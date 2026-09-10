import java.util.Scanner;

public class hollow_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int s = 1; s <= num  - i; s++) {
                System.out.print(" ");
            }

            if(i==1) {
                System.out.print("1");
            } 
            else if(i==num) {
                for(int j=1; j <= 2*num-1; j++) {
                    System.out.print(j);
                }
            }
            else{
                System.out.print("1");
                for(int k=1; k <= 2*i-3; k++) {
                    System.out.print(" ");
                }
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}
