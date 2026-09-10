public class Product {
     String pName;
     int qutie;
     public static String[] products = new String[3];
     public static int[] quantity = new int[3];
     static int count = 0;

     public Product(String n, int i) {
          pName = n;
          qutie = i;

          if(count<products.length) {
               products[count] = pName;
               quantity[count] = qutie;
               count++;
               System.out.println("Stored: " + pName);
          }else{
               System.out.println("Storage is full! Cannot add" + pName);
          }
     }

     public static void displayProducts() {
          System.out.println("=== Stored Products ===");
          for (int i = 0; i < products.length; i++) {
               System.out.println(products[i] + " - Qty: " + quantity[i]);
          }
     }

     public static void buy(String n, int q) {
          for(int i = 0; i < products.length; i++) {
               if(n.equals(products[i])) {
                    if (quantity[i] >= q) {
                         quantity[i] -= q;
                         System.out.println("Product Sold");
                    }else{
                         System.out.println("Quantity low");
                    }
                    return;
               }
          }
          System.out.println("Product not found");
     }

}