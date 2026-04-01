import java.util.Scanner;
class Store {
    String name;
    int quantity;
    double discount;
    double price;
    double total;
    double discountedPrice;

    public Store(String name, double discount, int price){
        this.name = name;
        this.discount = discount;
        this.price = price;
    }
    public void setQuantity(Scanner s) {
    
        System.out.print("Enter Quantity: ");
        quantity = s.nextInt();
        System.out.println("Quantity: " + quantity);
    }

    public double totalPurchased() {
       total = quantity * price;
       return total;
       
    }

    public String discount() {
        if (totalPurchased()> 24000) {

            discountedPrice = total * discount;
            System.out.println("Discount: " + discountedPrice);
            total -= discountedPrice;
            System.out.println("Total Purchase After Discount: " + total);
            return "Discount Applied";
        }
        else {
            return "No discount applied";
        }
    }
        
    
    public void display() {
    System.out.println("Customer Name: " + name);
    System.out.println("Discount: " + discount);
    System.out.println("Price: " + price);
    }

}

public class MyStore{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        Store myStore = new Store("Darwin", 0.20, 200);
        myStore.display();
        myStore.setQuantity(s);
        System.out.println("Total Purchase: " + myStore.totalPurchased());
        System.out.println(myStore.discount());
    }
}