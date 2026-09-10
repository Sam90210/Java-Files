public class Department {
    String dNam;
    int noSt;
    Student[] stds = new Student[5];
    int sCount=0;
    
    public Department(String n){
        dNam=n;
    }
    
    public void addStudent(Student o1, Student o2, Student o3){
        addStudent(o1);
        addStudent(o2);
        addStudent(o3);
        
    }
    
    public void addStudent(Student o){

        for(int i=0; i<sCount; i++){
            if(stds[i].getID() == o.getID()){
                System.out.println("Student with the same ID already exists, Please try with another ID" );
                
            }
        }
        
        stds[sCount]=o;
        sCount++;
        System.out.println("Welcome to "+dNam+" department, "+o.nam);
    }
    
    public void findStudent(int ID){
        if(ID<0){
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
        }
        
        for(int i=0; i<sCount; i++){
            if(stds[i].getID() == ID){
                System.out.println("Student Info:");
                System.out.println("Student Name: "+ stds[i].nam);
                System.out.println("ID: "+ stds[i].getID());
                System.out.println("CGPA: "+stds[i].cg);
            }
        }
        
    }

    public void details(){
        System.out.println("Department name: "+dNam);
        System.out.println("Number of Students: "+sCount);
        System.out.println("Details of the students:");

        for(int i=0; i<sCount; i++){
            System.out.println("Student Name: "+stds[i].nam+", ID:"+stds[i].getID()+", CGPA:"+stds[i].cg);
        }
    }
}