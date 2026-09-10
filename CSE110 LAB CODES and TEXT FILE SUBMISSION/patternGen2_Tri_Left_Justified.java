import java.util.Scanner;
public class patternGen2_Tri_Left_Justified{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for left justified triangle:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){    //row
            for(int j=1; j<=i;j++ ){//col
                System.out.print(j);
            }
             System.out.println();
        }
    }
}