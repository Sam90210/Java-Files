public class Bike extends Vehicle{
     
     boolean flag;
     String model;

     public Bike(String b, String m, int yr, int o, boolean tf){
          super(b, yr);
          this.model=m;
          this.flag=tf;
          this.setWheels(o);
     }

     public void doAWheelie(){

          if(getWheels()==2){
               System.out.println(getBrand()+":"+this.model+" is doing Wheelie!!");
          }
          else{
               System.out.println("Wheelie Failed. "+this.getBrand()+":"+this.model+" has SideCar");
          }
          
     }

     @Override 
     public String toString(){
          return "Bike "+super.toString()+", Model: "+this.model+", SideCar: "+this.flag;

     }

}
