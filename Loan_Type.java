import java.util.Scanner;

public class Loan_Type {
   public static void main(String[] args) {
   
      Scanner s = new Scanner(System.in);
   
      String product = "Car";
      double productPrice = 10000;
   
      int userChoice = loanType(s);
   
      switch(userChoice) {

        case 1:
         System.out.println("---PayDay loan---");
         double annualInterest = 500;
         System.out.println("Product: " + product + " Price: " + productPrice);
         System.out.println("Annual Interest: " + annualInterest);
         double total_AnnualPayment = annualInterest * productPrice;
         System.out.println("Total Payment: " + total_AnnualPayment);
         break;
         case 2: 
         System.out.println("---Installment---");
         double annuallInterest = 0.20;
         System.out.println("Product: " + product + " Price: " + productPrice);
         System.out.println("Annual Interest: " + annuallInterest);
         double total_AnnualPaymentt = annuallInterest * productPrice;
         System.out.println("Total Interest To Pay: " + total_AnnualPaymentt);
         productPrice += total_AnnualPaymentt;
         System.out.println("Total Payment: " + productPrice);
      break;
      
      case 3: 
         System.out.println("---CASH---");
         System.out.println("Product: " + product + " Price: " + productPrice);
         System.out.println("Total Payment: " + productPrice);
         System.out.println("No Interest!");
    
      default: 
         System.out.println("Thank You");
      break;
   }
}

    static int loanType(Scanner s) {

        System.out.println("1. PayDay Loan");
        System.out.println("2. Installment");
        System.out.println("3. Cash\n");
        System.out.print("Choose which type of loan payment you like:");
        int choice = s.nextInt();
        return choice;
    }
}