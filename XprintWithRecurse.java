public class XprintWithRecurse{
    public static void main(String[] args){
        printNum(5);
    }
    
    public static void printNum(int num){
        if(num == 0){
            return;
        }
        System.out.println("X");
        printNum(num-1);
    }
}