import java.util.Scanner;
public class treasure{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unlocking phrase:");
        String unlock = sc.nextLine();
        
        int vCount=0, cCount=0;
        for(int i=0; i<=unlock.length(); i++){
            char cha = unlock.charAt(i);
            if((cha>='a' && cha<='z')|| (cha>='A' && cha<='Z')){
                if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u' || cha=='A'|| cha=='E' || cha=='I' || cha=='O' || cha=='U'){
                    vCount++;
                }
                else{
                    cCount++;
                }
            }  
        }
        
        if(vCount>0 && cCount>0 && vCount%3==0 && cCount%5==0){
            System.out.print("AARR! Me Plunder!!");
        }
        else{
            System.out.print("Blimey! No Plunder!!");
        }
    }
}