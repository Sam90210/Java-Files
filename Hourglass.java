import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int n = scanner.nextInt();

        // Top half (including the middle 1)
        for (int i = n; i >= 1; i -= 2) {
            // print leading spaces
            for (int s = 0; s < (n - i) / 2; s++) {
                System.out.print(" ");
            }
            // print numbers from 1 to i
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 3; i <= n; i += 2) {
            // print leading spaces
            for (int s = 0; s < (n - i) / 2; s++) {
                System.out.print(" ");
            }
            // print numbers from 1 to i
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
