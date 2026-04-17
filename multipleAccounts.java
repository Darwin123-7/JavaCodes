import java.util.Scanner;
import java.util.Arrays;
public class multipleAccounts {
   public static void main(String[] args) {
   
      Scanner s = new Scanner(System.in);
   
      String[] userName = new String[5];
      String[] userPass = new String[5];
      int numberOfAcc = 0;
      int userChoice = 0;
      display();
      
      for(int i = 0; i < userName.length; i++) {
      
         System.out.print("UserName: ");
         userName[i] = s.nextLine();         
         System.out.print("Password: ");
         userPass[i] = s.nextLine();
         System.out.println(" ");
         numberOfAcc++;
      
      
         System.out.println("Enter 1 to stop  creating account. Enter Any number if you want to add more account");
         userChoice = s.nextInt();
      
         if (userChoice == 1) {
            System.out.println ("Thank You!");
         }
         
         else {
            s.nextLine();
            continue;
         }
      
         System.out.println("Total Accounts Created: " + numberOfAcc);
         return;
      
      }
      
      Arrays.sort(userName);
      Arrays.sort(userPass);
   
      System.out.println("Total Accounts Created: " + numberOfAcc);
      
      System.out.println("UserNames: " + Arrays.toString(userName));
      System.out.println("Password: " + Arrays.toString(userPass));
   
   }
   
   static void display() {
      System.out.println("-----Create Account-----");
   }
}