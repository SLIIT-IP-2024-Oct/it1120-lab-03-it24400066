import java.util.Scanner;

public class IT24400066Lab3Q1A {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice:");
        double pricePerKg=scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy:");
        double quantityKg = scanner.nextDouble();

        double totalAmount = pricePerKg * quantityKg;

        System.out.println("total amount to pay:" + totalAmount);
        
  }
}
