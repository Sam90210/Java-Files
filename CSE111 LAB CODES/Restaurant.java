public class Restaurant {
     String rName;
     String rAddrs;
     UberEatsUser[] orders = new UberEatsUser[4];
     int count=0;

     public Restaurant(String rName, String rAddrs){
          this.rName=rName;
          this.rAddrs=rAddrs;
     }

     public void takeOrder(UberEatsUser user){
          if(user.getAddrs()==null){
               System.out.println("Location : Unknown. Please update your location information!");
          }

          for (int i = 0; i < count; i++) {
            if (orders[i]==user) {
                System.out.println("You already have a pending order!");
                return;
            }
           }

          if (count >= 3) {
            System.out.println("We are really busy right now.");
            System.out.println("Please order after some time.");
            System.out.println("Thank you!");
            return;
          }

          orders[count] = user;
          count++;

          System.out.println("Your order has been added!");
          
     }

     public void completeOrders() {

        if(count==0) {
            System.out.println("No pending orders at the moment.");
            return;
        }

        System.out.println("Showing " + rName + "'s orders:");

        for(int i=0; i < count; i++) {
            System.out.println("Order by "+orders[i].getName()+" at "+orders[i].getAddrs()+" completed");

            orders[i] = null;
          }

        count = 0;
    }

     
}
