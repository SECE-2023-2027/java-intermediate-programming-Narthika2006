import java.util.*;
public class Main {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("ProductId :");
       String productId=sc.next();
       sc.nextLine();
       System.out.println("ProductName :");
       String productName=sc.nextLine();
       System.out.println("Price :");
       double price=sc.nextDouble();
       System.out.println("stockQuantity :");
       int stockQuuantity=sc.nextInt();
       System.out.println("Discount :");
       double percentage=sc.nextDouble();
        Product p = new Product(productId,productName,price,stockQuuantity);

        p.applyDiscount(percentage);

        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
    }
}