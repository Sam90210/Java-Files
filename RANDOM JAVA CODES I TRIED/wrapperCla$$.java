import java.util.Scanner;
public class wrapperCla$${
    public static void main(String[] args){
        
        //This way of writing will print right away after enter and input
        System.out.println("Write somthing integer");
        Scanner sc = new Scanner(System.in);
        int var1 = Integer.valueOf(sc.nextLine());
         System.out.println("You wrote "+var1);
         System.out.println("Now an String:");
         String var2 = String.valueOf(sc.nextLine());
         System.out.println("You wrote "+var2);
        
    }
}