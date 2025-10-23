import java.util.Scanner;
public class ReverseWordPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the srting:");
        String input = sc.nextLine();
        
        int pointer = input.length()-1; 
        
        for(int i=input.length()-1; i>=0; i--){
            char ch = input.charAt(i);
            if(ch==' '){
                for(int j=i+1; j<=pointer; j++){
                    ch = input.charAt(j);
                    System.out.print(ch);
                }
                System.out.print(" ");
                pointer = i-1;
            } 
            else if(i==0){
                for(int j=i; j<=pointer; j++){
                    char ch1 = input.charAt(j);
                    System.out.print(ch1);
                }
            }
        }
    }
}