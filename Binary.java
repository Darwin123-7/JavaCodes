public class Binary {
   public static void main (String[] args) {
   
      System.out.println("Binary Converter");
   
      int convert = 10000;
      
      String binary = "";
   
      while (convert != 0) {
      
         int remainder = convert % 2;
         binary = remainder + binary;
         convert = convert / 2;
        
      
      }
      System.out.println("Binary: " + binary);
   
   }
}

