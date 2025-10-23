public class NestedLoopExample{
    public static void main(String[] args){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
            /* as long as the condtion of inner loop is true
             * it'll continue executing untill it becomes false
             * after becoming false then it'll reach the outerloop
             */
                System.out.println(i+" "+j);
            }
            System.out.println();
        }
    }
}