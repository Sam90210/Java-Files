public class CheckingAccount extends Account {
    double bal=0;
    public static int count=0;
    
    public CheckingAccount(){
        super(0.0);
        count++;
    }
    
    public CheckingAccount(double val){
        super(val);
        count++;
    }
    
 
}
