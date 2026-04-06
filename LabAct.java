public class LabAct {
public static void main(String[] args) {
   
      int x = 15;
      int y = 30;
      System.out.println("Before method call" + " x = " + x + " y = " + y);
      
      attemptSwap(x, y);
   
      System.out.println("After method call" + " x = " + x + " y = " + y);
   }
   public static void attemptSwap( int a, int b) {
   
      int temp = a;
      a = b;
      b = temp;
      System.out.println("Inside attemptSwap method: x = " + a + " y = " + b);
   }

}
