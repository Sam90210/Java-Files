public class SeriesPrint{
    
    public static void main(String[] args){
        System.out.println(printSum(5));
    }
    
    public static int printSum(int sum){
        if(sum == 1){
            return sum;
        }
        return sum + printSum(sum-1);
    }
}