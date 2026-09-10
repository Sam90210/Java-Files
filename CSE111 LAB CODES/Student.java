class Student{
    private int id;
    public String nam;
    public double cg;

    public Student(String n, int i, double c){
        this.id=i;
        this.nam=n;
        this.cg=c;
    }

    public void setId(int i){
        id=i;
    }

    public int getID(){
        return id;
    }
}