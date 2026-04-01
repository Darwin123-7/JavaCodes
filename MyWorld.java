class World {

   long setAge;
   String worldName;
   long population;
   

   public World(long age, String name) {
   
      setAge = age;
      worldName = name;
   }
   
   public void worldPopulation(long population) {
      this.population = population;
      System.out.println("Population: " + population);
   }
   
   public void destruction() {
      if (population > 600000000) {
         System.out.println("Destroy");
      }
      else {
         System.out.println("Spare");
      }
   }
}

public class MyWorld {
   public static void main(String[] args) {
      
      World world = new World( 600000000, "Earth");
      System.out.println("Planet Name: " + world.worldName);
      System.out.println("Planet Age: " + world.setAge);
      world.worldPopulation(700000000);
      world.destruction();
   }
}
