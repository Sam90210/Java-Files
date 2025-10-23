import java.util.Scanner;
public class CommonCancellation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        String result = "";
        for(int i=0; i<st1.length(); i++){
            char ch1 = st1.charAt(i);
            boolean flag = false;
            for(int j=0; j<st2.length(); j++){
                if(ch1==st2.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result += (char)(ch1-32);
            }
        }
        for(int i = 0; i < st2.length(); i++){
            char ch2 = st2.charAt(i);
            boolean flag = false;
            for(int j=0; j < st1.length(); j++){
                if(ch2==st1.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) 
            {
                result = result + (char)(ch2 - 32); 
            }
        }
        System.out.println(result);
    }
}