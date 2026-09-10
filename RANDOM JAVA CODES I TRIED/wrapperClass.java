import java.util.Scanner;
public class wrapperClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* You gotta sequentially input the values. 
        First Integer then sequentially double, and boolean value
        because Java runs line by line sequentially.
        unless i use loop conditions
        */
        System.out.println("Enter String Value first:");
        String userInput = sc.nextLine();
        System.out.println("Now an integer value:");
        int var1 = Integer.valueOf(sc.nextLine());
        System.out.println("Now an double value:");
        double var2 = Double.valueOf(sc.nextLine());
        System.out.println("Now an boolean value:");
        boolean var3 = Boolean.valueOf(sc.nextLine());
        
        System.out.println("Inputs given by user:");
        System.out.println(userInput);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        //You need to give the right type of input at each step, 
        //or the program will crash trying to convert "Hello" into a number.
    }
}