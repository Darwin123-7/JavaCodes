import java.util.Scanner;
public class BankingSystem {
   public static void main(String[] args) {
   
      Scanner s = new Scanner(System.in);
   
      String[] services = new String[4];
   
      display(services);
      int myStock = userStock();
      userChoice(s, myStock);
      userChoice(s, myStock);
      System.out.println(myStock);
   
   
   }
   static void display(String[] services) {
      System.out.println("Services: " );
      
      services[0] = "Check Stock";
      services[1] = "Buy Stock";
      services[2] = "Sell Stock";
      services[3] = "Exit";
      
      for(int i = 0; i < services.length; i++) {
         System.out.println( (i + 1) +". " + services[i]);
      }
   }
   static int userStock() {
      return 500;
   }
   static int money() {
      return 100000;
   }
   static int pricePerStock() {
      return 500;
   }
   
   
   static void userChoice(Scanner s, int userStcok) {
   
      userStcok = userStock();
      int choice = 0;
      while( choice != 4) {
      
         System.out.print("\nChoose service to avail: ");
         choice = s.nextInt();
            
                    
         if (choice == 1) {
         
            int inverstorMoney = money();
            System.out.print("\nInverstor Money: " + inverstorMoney + "\n");
            System.out.println("\n---Check Stock---");
            System.out.println("Total Stock: " + userStcok);
            System.out.println("\n---Press 4 to exit---");
         }   
         
         else if(choice == 2) {
         
            int inverstorMoney = money();
            int stockPrice = pricePerStock(); 
            //int stockQuantity = userStock();
            userStcok = userStock();
         
            
            int stock = 0;
            System.out.print("Inverstor Money: " + inverstorMoney);
            System.out.println("\n---Buy Stock---");
            System.out.println("How Many Stocks to buy");
         
            
            while(inverstorMoney != 0) {
            
               if (inverstorMoney < 0) {
                  System.out.println("insuffiecient fund");
               
                  return;
               }
               else {
                  System.out.print("Buy Stock: ");
                  stock = s.nextInt();
                  userStcok += stock;
               
                  int quantity = stock * stockPrice;
               
                  inverstorMoney -= quantity;
                  
                  if(inverstorMoney < 0) {
                     inverstorMoney = 10000;
                     System.out.println("Your Money is lower compared to the quantity-price ratio of stocks");
                     System.out.println("Current Balance: " + inverstorMoney);
                     return;
                  } 
                  else {
                     System.out.println("Remaining Money: " + inverstorMoney);
                  }
                  
               
               }
            
            }
         
            System.out.println("Stocks: " + userStcok);
         }
            
         else if(choice == 3) {
            System.out.println("---Sell Stock---");
         }  
         
         else {
            System.out.println("---Exit---");
         }
      
      }
   }
}