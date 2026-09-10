public class Concert {
     
     String Vname;
     String[] aName = new String[2];
     String time;
     static int count;
     int soldTs;
     static int totalT;
     public Concert(String Vname, String time){
          this.Vname=Vname;
          this.time=time;
     }

     public void addArtist(String Name){
          if(count<2){
               aName[count]=Name;//যদি বার বার মেথড কল করে নাম অ্যাড করা হয় তাহলে,
               count++;          //if Statement দিয়ে array তে artist name রাখা। 
          }
     //আর যদি *একেবারে* অনেকগুলা অ্যাড করা লাগে তাহলে লুপ ব্যাবহার করা   
     }
     public void buyTicket(){

     }

     public void buyTicket(String zone){
          System.out.println("Total price: 1000");
          soldTs++;
          totalT++;
     }

     public void buyTicket(String zone, int qnty){
          System.out.println("Total price: "+500*qnty);
          soldTs=qnty;
          totalT+=qnty;
     }

     public static void showTotalTicketsSold(){
          System.out.println("Total tickets sold (all venues): "+totalT);
     }

     public void showDetails(){ 
          System.out.println("Venue: "+Vname);
          System.out.println("Showtime: "+time);
          System.out.println("Artists:");

          for(int i=0; i<count; i++){
               System.out.println("-"+aName[i]);
          }

          System.out.println("Tickets sold in this concert: "+soldTs);
     }
}
