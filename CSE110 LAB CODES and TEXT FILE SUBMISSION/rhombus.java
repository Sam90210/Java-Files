import java.util.Scanner;
public class rhombus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int spc=0; spc<num-i; spc++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i-1); j++){
                System.out.print(j);
            } 
            System.out.println();
        }
            for(int z=num-1; z>=1; z--){
                for(int spc=0; spc<num-z; spc++){
                System.out.print(" ");
                }
                for(int y=1; y<=(2*z-1); y++){
                System.out.print(y);
                }
                System.out.println();
            }
    }
}