public class DigitSum {
   public static void main(String[] args) {
   
      int num = calculateDigitSum(8432);
   
      System.out.println(num);
   }
   static int calculateDigitSum(int n) {
   
      if (n == 0) {
         return 0;
      }
      else {
         return  (n % 10) + calculateDigitSum (n / 10);
      }
   }
}