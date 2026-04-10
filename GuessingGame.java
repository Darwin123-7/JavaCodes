import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
   public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      Random r = new Random();
   
   
      int attempt = 0;
      int attemptLimit = 3;
      int randomNum = r.nextInt(1,10);
            
      while( attempt != attemptLimit) {  
         System.out.print("Guess The Number: " );
         int guess = s.nextInt();
         attempt++;
      
         if (guess == randomNum) {
            System.out.println("You Guess it Correctly: " + guess );
            return;
         }
         else {            
            System.out.println("Nah Wrong. Guess limit: " +  (attemptLimit-attempt));
         
         }
      }
   }
}
