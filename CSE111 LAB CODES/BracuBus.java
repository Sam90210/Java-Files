public class BracuBus {
    String rName;
    int sCount=0;
    int maxSeat=2;

    public BracuBus(String r){
        rName=r;
    }

    public BracuBus(String r, int m){
        rName=r;
        maxSeat=m;
    }

    public void showDetails(){
        System.out.println("Bus Route: "+rName);
        System.out.println("Passanger Count"+sCount+"(Max:"+maxSeat+")");
        System.out.println("Passengers onboard:");
    }

    public void collectPass(){
        
    }
}
