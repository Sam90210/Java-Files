import java.util.Scanner;
public class DownwardPalindromicTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        for(int i = n; i>=1; i--) {//Outer Loop for number of rows
            for(int j=1; j<= (n-i); j++) {//Inner loop for spaces
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {//Inner loop for increasing numbers
                System.out.print(k);
            }
            for(int l=(i-1); l>=1; l--) {//Inner loop for decreasing numbers
                System.out.print(l);
            }
            System.out.println();
        }
    }
}