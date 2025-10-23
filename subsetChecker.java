import java.util.Scanner;
public class subsetChecker{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         //Creating array1
         System.out.println("Please enter the length of array 1:");
         int length1 = sc.nextInt();
         int[] arr1 = new int[length1];
         
         //Keeping array1's element
         System.out.println("Please enter the elements of array1:");
         for(int i=0; i<length1; i++){
             arr1[i] = sc.nextInt();
         }
         
         //Creating array2
         System.out.println("Please enter the length of array 2:");
         int length2 = sc.nextInt();
         int[] arr2 = new int[length2];
         
         //Keeping array1's element
         System.out.println("Please enter the elements of array2:");
         for(int i=0; i<length2; i++){
             arr2[i] = sc.nextInt();
         }
         
         /*Cross checking the elements to determine if the array2 is
           the subset of array1*/
         int count = 0;
         for(int i=0; i<arr2.length; i++){
             if(arr2[i]==arr1[i]){
                 System.out.println("Array 2 is a subset of Array 1.");
             }
             
         }
    }
}