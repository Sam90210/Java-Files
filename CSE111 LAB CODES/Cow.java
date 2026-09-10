class Cow extends Animal {
     String name;

     public Cow() {
          super();
          System.out.println("The cow says hello!");
     }

     public String getName() {
          return this.name;
     }

     public void details() {
          super.details();
     }

     public void updateSound(String snd) {
          super.sound = snd;
     }

}
