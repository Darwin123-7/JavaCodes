import java.util.Scanner;
public class Record {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String[][] name = new String[3][2];
   
   
     for (String[] names : name) {

    System.out.println("Enter Name:");
    names[0] = s.nextLine();

    System.out.println("Print Role: ");
    names[1] = s.nextLine();
}
      
      for( String[] names : name) {
      
         if (names[1].equalsIgnoreCase("Manager")) {
            System.out.print(names[0] + " Manager");
         }
         else {
            System.out.println(names[0] + " Staff");
         }
      }
      
      
   }
}