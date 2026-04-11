import java.util.Scanner;
public class CashTransfer {
   public static void main (String[] args) {
   
      Scanner s = new Scanner(System.in);
      System.out.println("Welcome to X Money Padala");
   
      services();
      
      int serviceChoice = userChoice(s);
      
      switch(serviceChoice) {
         case 1: 
            System.out.println("---Cash Transfer---");
            System.out.print("How much money to transfer: ");
            int cash = cashTransfer(s);
            System.out.println("Customer Transferred: " + cash);
            
            double interestt = interest(cash);
            System.out.println("Regardless of the value the interet per transfer is: " + 0.10 + "% interest");
            System.out.println("Service fee: " + interestt);
            break;
            
         case 2: 
            System.out.println("---Cash Receive---");
            double cashh = tobeReceived(6000);
            System.out.println("Cash to be received: " + cashh);
            
            String cashCode = codeNum(s);
            String actualCode = code();
            
            if(cashCode.equals(code())) {
               System.out.println("System: Cash Received");
               System.out.println("No receiving fee");
               System.out.println("---Thank You for using our service---");
            }
            else {
               System.out.println("Invalid Code");
            }
            
            break;
         default:
            System.out.println("Thank you for using our service");
            break;
      }
   }
   static void services() {
      System.out.println("Services: " );
      System.out.println("1. Cash Transfer");
      System.out.println("2. Cash Receive");
      System.out.println("3. Sangla");// Your next
   }
   static int userChoice(Scanner s) {
      System.out.println("Choose which service to choose: " );
      int choice = s.nextInt();
      return choice;
   }
   
   static int cashTransfer(Scanner s) {
      int cash = s.nextInt();
      return cash;
      
   }
   static double interest(double cash) {
      double interestt = 0.10;
      double fee = cash * interestt;
      return fee;
   }
   
   static double tobeReceived(double receive){
      double toreceive = receive;
      return toreceive;
   }
   static String codeNum(Scanner s) {
      System.out.print("Enter Code: ");
      s.nextLine();
      String userInput = s.nextLine();
      return userInput;
   }
   static String code() {
      String code = "a6b994";
      return code;
   }
}