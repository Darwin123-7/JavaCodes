import java.util.Scanner;
public class Interest {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
   
      int payCheck = salary(s);
   
      System.out.println("Salary: " + payCheck);
      System.out.println("Your Tax: " + tax(payCheck));
      
      double takeHomePay = payCheck - tax(payCheck);
      
      System.out.println("Take HomePay: " +takeHomePay);
      
      
      s.close();
   }
   static int salary(Scanner s) {
      System.out.print("Enter Salary:");
      int salary = s.nextInt();
      return salary;
   }

   static double tax(double salary) {
      if(salary >= 100000) {
         return salary * 0.35;
      }
      else if (salary >=75000) {
         return salary * 0.25;
      }
      else {
         return salary * 0.10;
      }
   }
   
}