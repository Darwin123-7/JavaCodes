public class DataProcessor {
   public static void main(String[] args) {
   
      int x = 8;
      System.out.println(processData(x));
      displayProcess("echo", 2);
      
   }
   static int processData(int num1) {
      return num1 * num1;
   }
   static void displayProcess(String disp, int n) {
   
      /*for (int i = 0; i < n ; i++) {
         System.out.println("PRocessing result " + disp);
      }*/
      
      while( n <= 5) {
         n++;
      
         System.out.println("PRocessing result " + disp);
      }
   }
}