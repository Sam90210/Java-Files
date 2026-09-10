public class PlatinumCard extends CreditCard {

     public PlatinumCard(String holder, String acNo){
          super(holder, acNo, 100);
     }
     
     public void spendCash(int a){
          System.out.println("Previous Reward Points: " + rewardPoints);
          rewardPoints=rewardPoints+(a/100)*2;
           System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);
     }
}
