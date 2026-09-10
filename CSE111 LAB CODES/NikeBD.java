public class NikeBD {
     
     String branchName;
     static int branchCount;
     String[] pds = {"Jordan", "Cortez", "Kobe"};
     int[] qty = new int[3];
     static int sold;
     static String[] pds2 = {"Jordan", "Cortez", "Kobe"};
     static int[] qty2 = new int[3];

     public NikeBD(String bN){
          this.branchName=bN;
          branchCount++;
     }

     public static void status(){
          System.out.println("Nike Bangladesh Status:");
          System.out.println("Branches Opened: "+branchCount);
          System.out.print("Currently Stocked: ");
          printStock(pds2, qty2);
          System.out.println("Sold: "+sold);
     }

     public void details(){
          System.out.println("Nike "+this.branchName+" outlet:");
          System.out.print("Products Currently Stocked: ");
          printStock(pds, qty);
          System.out.println("Sold: "+branchSold);
     }

     int branchSold;

     public void restockProducts(String product, int amount){
          restock(product, amount);
     }

     public void restockProducts(String[] p, int[] q){
          int length = Math.min(p.length, q.length);
          for(int i = 0; i < length; i++){
               restock(p[i], q[i]);
          }
     }

     public void productSold(String product1, int amount1, String product2, int amount2){
          sell(product1, amount1);
          sell(product2, amount2);
     }

     private void restock(String product, int amount){
          int index = productIndex(product);
          if(index != -1 && amount >= 0){
               qty[index] += amount;
               qty2[index] += amount;
          }
     }

     private void sell(String product, int amount){
          int index = productIndex(product);
          if(index != -1 && amount >= 0 && amount <= qty[index]){
               qty[index] -= amount;
               qty2[index] -= amount;
               branchSold += amount;
               sold += amount;
          }
     }

     private int productIndex(String product){
          for(int i = 0; i < pds.length; i++){
               if(pds[i].equals(product)){
                    return i;
               }
          }
          return -1;
     }

     private static void printStock(String[] products, int[] amounts){
          for(int i = 0; i < products.length; i++){
               System.out.print(products[i]+": "+amounts[i]);
               if(i < products.length - 1){
                    System.out.print(", ");
               }
          }
          System.out.println();
     }
}
