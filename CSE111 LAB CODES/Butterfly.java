 public class Butterfly extends Caterpillar {
          
     public Butterfly(String n, int i){
          super(n, i);
     }

     @Override
     public void transform(){
          System.out.println("Caterpillar transforms into Butterfly");
     }
     
     @Override
     public void eat(int i){
          energy=(i*5)-5;
          System.out.println("Butterfly lost energy while flying and absorbed nectar");
     }

     @Override
     public void showDetails(){
          System.out.println("Food: " + food);
          System.out.println("Age: " + age);
          System.out.println("Energy: " + energy+" joules");

     }

}
