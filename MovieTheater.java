public class MovieTheater {
   public static void main(String[] args) {
   
      
      int combo = getCombo(3, " PopCorn");
      System.out.println("total Cost: " + combo);
   }
   static int ticketPrice(int tickets) {
   
      return tickets * 200;
   }
   static int getCombo(int ticket, String snacks) {
   
      int total = ticketPrice(ticket);
   
      if(snacks.equals(" PopCorn")) {
         total += 150;
      }
      else {
      
      }
      return total;
   }
}