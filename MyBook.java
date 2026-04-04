class Book {
   String author;
   int page;
   double price;
   String title;

   Book(String author, int page) {
      this.author = author;
      this.page = page;
   }

   public void setPrice(double price) {
      this.price = price;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public void display() {
      System.out.println("Author: " + author);
      System.out.println("Title: " + title);
      System.out.println("Price: " + price + "$");
      System.out.println("Pages: " + page);
   }
}
public class MyBook {
   public static void main(String[] args) {
   
      Book book = new Book("Ivan P. Pango", 193);
      book.setPrice(20.0);
      book.setTitle("The Idiot");
      book.display();
   }
}