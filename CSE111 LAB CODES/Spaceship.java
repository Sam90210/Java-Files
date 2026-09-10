public class Spaceship {
    String SpName;
    int SpCapacity;
    int wtCount=0;
    public Spaceship(String SpName, int SpCapacity){
        this.SpName=SpName;
        this.SpCapacity=SpCapacity;
    }

    public void loadCargo(Cargo obj){
        if(obj.getWt()+wtCount>SpCapacity){
            System.out.println("Warning: Unable to load"+obj.getNam()+
            " inside "+SpName+". Exceeds capacity by "+
            ((obj.getWt()+wtCount)-SpCapacity));
        }
        if(obj.getWt()+wtCount<=SpCapacity){
            wtCount+=obj.getWt();
        }
    }

    public void displayDetails(){
        System.out.println("Spaceship Name: "+SpName);
        System.out.println("Capacity: "+SpCapacity);
        System.out.println("Current Cargo Weight :"+wtCount);
    }
}
