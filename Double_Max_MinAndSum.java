//taks3
import java.util.Scanner;
public class Double_Max_MinAndSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int LoA = sc.nextInt();
        double[] arr1 = new double[LoA];
        System.out.println("Enter the numbers:");
        for(int i=0; i<LoA; i++){
            arr1[i] = sc.nextDouble();
        }
        double max = arr1[0];
        int maxindex = 0;
        double min = arr1[0];
        int minindex = 0;
        double sum = 0;

        for(int i=0; i<LoA; i++){
            if(arr1[i]>max){
                max = arr1[i];
                maxindex = i;
            }
            if(arr1[i]<min){
                min = arr1[i];
                minindex = i;
            }
            sum += arr1[i];
        }
        double average = sum/LoA;
        System.out.println("Maximum element " + max + " found at index " + maxindex);
        System.out.println("Minimum element " + min + " found at index " + minindex);
        System.out.println("Summation: " + sum);
        System.out.printf("Average: %.2f\n", average);
    }
}