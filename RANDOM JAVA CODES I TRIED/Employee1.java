public class Employee1{
    private String eName;
    private int id;
    private String wTime;
    
    
    public Employee1(){
        System.out.println("A default employee has been created");
    }
    
    public Employee1(String n, int i, String t){
        this.eName=n;
        this.id=i;
        this.wTime=t;
    }
    
    
    
    public String gName(){
        return eName;
    }
    
    public int gID(){
        return id;
    }
    
    public String gTime(){
        return wTime;
    }
}