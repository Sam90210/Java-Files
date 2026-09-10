public class Character{
    int ID;
    String nam;
    String grp;
    int HP;
    
    public static String strongestChar="None";
    public static int kids=0;//public static int kids=0, teens=0, adults=0, totalChars=0;
    public static int teens=0;
    public static int Adults=0;
    public static int totalChars=0;
    public static int totalHP=0;
    public static int strongestHP=0;
    
    public Character(String n, String p, int HP){
        totalChars++;
        this.ID=totalChars;
        this.nam=n;
        this.grp=p;
        this.HP=HP;
        totalHP+=HP;
        
        if(grp.equals("Kid")){
            kids++;
        }
        else if(grp.equals("Teen")){
            teens++;
        }
        else if(grp.equals("Adult")){
            Adults++;
        }
        if(this.HP>strongestHP){
            strongestHP=this.HP;
            strongestChar=this.nam;
        }
    }
    
    public Character(String n, int HP){
        totalChars++;
        this.ID=totalChars;
        this.nam=n;
        this.HP=HP;
        totalHP+=HP;
        
        if(this.HP>strongestHP){
            strongestHP=this.HP;
            strongestChar=this.nam;
        }
    }
    
    public void printDetails(){
        System.out.println("ID:"+this.ID+", Name: "+this.nam);
        System.out.println("Group:"+this.grp);
        System.out.println("Health: "+HP);
    }
    
    public static void printStats(){
        double avgHP=0;
        
        if(totalChars>0){
            avgHP=(double)totalHP/totalChars;
        }
        System.out.println("Total Characters: "+totalChars);
        System.out.println("Kids: "+kids);
        System.out.println("Teens: "+teens);
        System.out.println("Adults: "+Adults);
        System.out.println("Average Health: "+avgHP);
        System.out.println("Strongest Character: "+strongestChar);
        
        if(!strongestChar.equals("None")){
            System.out.println(strongestChar+" (Health "+strongestHP+")");
        }
        
        else{
            System.out.println(strongestChar+" (Health "+strongestHP+")");
        }
    }
}