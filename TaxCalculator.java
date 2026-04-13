public class TaxCalculator {
   public static void main(String[] args) {
   
      double tax = computeTotalTax(50000,3);
   
      if( tax >= 0) {
         System.out.println("The final calculated tax: " + tax);
      }
      else {
         System.out.println("0");
      }
   }
   static double computeBaseTax(double salary) {
   
      return salary * 0.10;
   }

   static double computeTotalTax( double salary, int dependents) {
   
      dependents *= 500;
      
      return computeBaseTax(salary) - dependents;
   }
}