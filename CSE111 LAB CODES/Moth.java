public class Moth extends Caterpillar{
     
     public Moth(String n, int i){
          super(n, i);
     }

     @Override
     public void transform(){
          System.out.println("Caterpillar transforms into Moth");
     }

     @Override
     public void eat(int i){
          energy=(i*2.5)-2.5;
          System.out.println("Moth lost energy due to nocturnal activity");
     }

     @Override
     public void showDetails(){
          System.out.println("Food: " + food);
          System.out.println("Age: " + age);
          System.out.println("Energy: " + energy+" joules");

     }
}
