public class BracuStudent {
    String sName;
    private String loc;
    boolean pass = false;

    public BracuStudent(String n, String l){
        sName=n;
        loc=l;


    }

    public void showDetails(){
        System.out.println("Student Name: "+sName);
        System.out.println("Lives in "+loc);
        System.out.println("Have bus Pass?"+pass);
        
    }

    public void collectPass(){
        pass=true;
    }

    



}
