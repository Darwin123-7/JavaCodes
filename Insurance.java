import java.util.Scanner;
public class Insurance {
   public static void main(String[] args) {
   
      Scanner s = new Scanner(System.in);
   
      int homePrice = 4000000;
      int carPrice = 25000;
      int healthBill = 6000;

      int homeCoverage = 300000;
      int carCoverage = 10000;
      int healthCoverage = 2000;
      
      int homeDeductible = 10000;
      int carDeductible = 1000;
      int healthDeductible = 100;
      insuranceType();
            
                  
      switch(userChoice(s)) {
      
         case 1:
            System.out.println("---Home Insurance---");
            System.out.println("Policy limit coverage: " + homeCoverage + "$");
            System.out.println("Condition: File claim must be submitted 15 days after the event.");
            System.out.println("Exclusion: Flood, intentional damage, earthquake");
            System.out.println("Deductible: " + homeDeductible);
            if (deductible(s) >= homeDeductible) {
               System.out.println("Insurance Claimed");
               System.out.println("Status: Paid");
            
            }
            else {
               System.out.println("Pay deductible first");
            }
            
            break;
         case 2:
            System.out.println("---Car Insurance---");
            System.out.println("Policy limit coverage: " + carCoverage + "$");
            System.out.println("Condition: File claim must be submitted 15 days after the event.");
            System.out.println("Exclusion: Theft, intentional damage, Reject");
            System.out.println("Deductible: " + carDeductible);
            if (deductible(s) >= carDeductible) {
               System.out.println("Insurance Claimed");
               System.out.println("Status: Paid");
            
            }
            else {
               System.out.println("Pay deductible first");
            }
         
            break;
         case 3:
            System.out.println("---Health Insurance---");
            System.out.println("Policy limit coverage: " + healthCoverage + "$");
            System.out.println("Condition: File claim must be valid: when the policy holder is injured, or its beneficiary or family is injured, has a cancer.");
            System.out.println("Exclusion: Dental, Derma, Death");
            System.out.println("Deductible: " + healthDeductible);
            if (deductible(s) >= healthDeductible) {
               System.out.println("Insurance Claimed");
               System.out.println("Status: Paid");
            }
            else {
               System.out.println("Pay deductible first");
            }
         
            break;
         case 4:
            System.out.println("---Death Insurance---");
            System.out.println("Condition: Death Insurance will be claim by the family if the policy holder is dead within 25 years of insurance premium.");
            break;
         default:
            System.out.println("Thank You For using our Service");
            break;
      }
      s.close();
   }
   static void insuranceType() {
      System.out.println("Services:");
      System.out.println("1. Home Insurance");
      System.out.println("2. Car Insurance");
      System.out.println("3. Health Insurance");
      System.out.println("4. Death Insurance");
   }
   static int userChoice(Scanner s) {
    
      System.out.print("Enter which service to avail: " );
      int choice = s.nextInt();
      return choice;
   }
   
   static int deductible(Scanner z) {
      System.out.print("Pay deductible: ");
      int valueD = z.nextInt();
      return valueD;
   }
}
