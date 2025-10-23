import java.util.Scanner;
public class hollowTriangleRightJustified{// Bhul code likhsos bhalo mot sikh mc
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num = sc.nextInt();
        for(int i=num; i>=1; i--){
            for(int sp = 1; sp<i; sp++){
                System.out.print(" ");
            }
            
            for(int k =i; k<num; k++){
                System.out.print(" ");
            }
                if(i!=num) {
                System.out.print(num);
                }
                if(i==1){
                    for(int j=i; j<=num; j++){
                         System.out.print(j);
                    }
                }
                System.out.println();
        }
    }
}