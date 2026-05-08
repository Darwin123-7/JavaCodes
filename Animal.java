
class Animal {

   private String petName;
   
   void setPetName (String newPetName) {
      this.petName = newPetName;
   }
   
   String getPetName () {
   
      return this.petName;
   }

}

class MyPet {
   public static void main(String[] args) {
   
      Animal name = new Animal();
      
      name.setPetName("Dolan");
      System.out.println("Name: " + name.getPetName());
      
     
   
   }
}