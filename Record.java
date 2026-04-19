import java.util.Scanner;
import java.util.Arrays ;
public class Record {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String[][] name = new String[3][2];
   
   
      for(int i = 0; i < name.length; i++) {
      
         System.out.println("Enter Name:");
         name[i][0] = s.nextLine();
         System.out.println("Print Role: ");
         name[i][1] = s.nextLine();
      
       
      }
      
      for(int i = 0; i <name.length; i++) {
      
         if (name[i][1].equalsIgnoreCase("Manager")) {
            System.out.print(name[i][0] + " Manager");
         }
         else {
            System.out.println(name[i][0] + " Staff");
         }
      }
      
      
   }
}