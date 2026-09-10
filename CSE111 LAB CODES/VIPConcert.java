public class VIPConcert extends Concert {
     
     
     String time;
     int soldTs;
     public VIPConcert(String ven, String time){
          super(ven,time);
     }
     
     @Override
     public void buyTicket(){
          soldTs++;
          totalT++;
          System.out.println("Tickets sold in this concert: "+soldTs);
     }

     public void addArtist(String artist){
          
     }

     @Override
     public void showDetails(){ 
          System.out.println("Venue: "+Vname);
          System.out.println("Showtime: "+time);
          System.out.println("Artist: \n-Atif Aslam");
          System.out.println("Tickets sold in this concert: "+soldTs);
     }

}
