public class Cargo {
    private String nam;
    private int wt;

    public Cargo(String nam, int wt){
        this.nam=nam;
        this.wt=wt;
    }

    public int getWt(){
        return wt;
    }

    public String getNam(){
        return nam;
    }
}
