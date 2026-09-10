public class factorialDtmnLoopAndRecurr{
    
    public static void main(String[] args){
        System.out.println("Factorial of 7 is "+factorial(7));
    }
    
    public static int factorial(int num){
        int result;
        if(num == 1){//BASE CASE
            return 1;
        }
            result = num*factorial(num-1);//Using recursion AKA RECURSIVE CASE
            return result;
    }
    
    
//    public static int factorial(int num){//using looop not recursion
//        int result = num;
//        for(int i=num-1; i>=1; i--){
//            result = result*i;
//        }
//        return result;
//    }
}