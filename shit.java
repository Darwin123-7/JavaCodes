public class shit {
   public static void main(String[] args) {
   
   
      int[][] num = new int[3][3];
   
      num[0][0] = 1;
      num[0][1] = 2;
      num[0][2] = 3;
      num[1][0] = 1;
      num[2][0] = 1;
      num[2][1] = 2;
      num[1][1] = 7;
      num[1][2] = 4;
      num[2][2] = 100;
   
      for (int number[] : num) {
      
         System.out.println(number[2]);
      }
   
   
      for (int i = 0; i < num.length; i++) {
         for (int j = 0; j < num[i].length; j++) {
            System.out.print(num[i][j] + " ");
         }
         System.out.println();
      }
   }

}