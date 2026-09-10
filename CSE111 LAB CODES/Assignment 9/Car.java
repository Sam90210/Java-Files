public class Car extends Vehicle{

     String model;
     int door;
     boolean auto;

     public Car(String b, String m, int yr, int cap, int o, boolean tf){
          super(b, yr);
          this.model=m;
          this.door=cap;
          this.auto=tf;
          setWheels(o);
     }

     public void startAutoPilot(){
          if (this.auto==true) {
            System.out.println(getBrand()+":"+this.model+"s AutoPilot Started");
        }
        else {
            System.out.println(getBrand()+":"+this.model+" has NO AutoPilot");
        }
     }

     @Override 
     public String toString(){
          return "Car "+super.toString()+", Model: "+this.model+", Doors: "+this.door+", AI: "+this.auto;
    }

     
}
