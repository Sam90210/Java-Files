public class UberEatsUser {
    private String uName;
    private String uAddrs;


    public UberEatsUser(String uName){
        this.uName=uName;
    }

    public UberEatsUser(String uName, String uAddrs){
        this.uName=uName;
        this.uAddrs=uAddrs;
    }

    public void updateLocation(String uAddrs){  
        if(uAddrs.equals(null)){
            this.uAddrs=uAddrs;
            System.out.println("Update Successful!");
        }
        else{
            System.out.println("We already have your location.");
            System.out.println("Please place an order!");
        }
    }

    public String getName(){
        return uName;
    }

    public String getAddrs(){
        return uAddrs;
    }
}
