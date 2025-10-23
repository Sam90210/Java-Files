import java.util.Scanner;
public class wrapperClass{
    public static void main(String[] args){
        System.out.println("First enter usual string then integer then double type then boolean type");
        Scanner sc = new Scanner(System.in);
        /* You gotta sequentially input the values. 
        First Integer then sequentially double, and boolean value
        because Java runs line by line sequentially.
        unless i use loop conditions
        */
        String userInput = sc.nextLine();
        int var1 = Integer.valueOf(sc.nextLine());
        double var2 = Double.valueOf(sc.nextLine());
        boolean var3 = Boolean.valueOf(sc.nextLine());
        System.out.println("User String " + userInput);
        System.out.println("The user gave: "+var1);
        System.out.println("The user gave: "+var2);
        System.out.println("The user gave: "+var3);
        //You need to give the right type of input at each step, 
        //or the program will crash trying to convert "Hello" into a number.
    }
}