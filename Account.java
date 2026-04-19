import java.util.Scanner;
public class Account {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
   
      String[] Username = new String[5];
      String[] pass =  new String[5];
      
      String logIn;
      String password;
      String userChoice;
      
      int attempt = 0;
      int attemptLimit = 3;
      
      System.out.print("-----------Create Account------------\n");
      System.out.print("New Username: ");
      Username[0] = s.nextLine();
      System.out.print("New PassWord: ");
      pass[0] = s.nextLine();
   
   
      System.out.println("You have succesfully created an acccount");
      
      System.out.print("Press Y if you want to Log In. Press other key to exit: ");
      userChoice = s.nextLine();
      
      if(userChoice.equalsIgnoreCase("Y")) {
         System.out.println("\n-------Log In---------");
      }
      else {
         System.out.println("Thank You");
         return;
      }
      
      while( attemptLimit > attempt) {
         System.out.print("\nEnter UserName: " );
      
         logIn = s.nextLine(); 
         System.out.print("Enter Password: " );
      
         password = s.nextLine();
      
      
         if(password.equals(pass[0]) && logIn.equals(Username[0])) {
            System.out.println("Welcome!");
            break;
         }
         
         else {
            attempt++;
            System.out.println("Incorrect: attempts left " + (attemptLimit - attempt));
            
         }
         
         
      }
      
      if(attempt == attemptLimit) {
         System.out.println("Account Locked!");
      }
   }
}