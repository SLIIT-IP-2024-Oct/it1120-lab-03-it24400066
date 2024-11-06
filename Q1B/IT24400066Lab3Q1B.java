import java.util.Scanner;

public class IT24400066Lab3Q1B {
    public static void main(String [] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice:");
        double pricePerKg = scanner.nextDouble();

        System.out.print("enter the number of kilogram you want to buy:");
        double quantityKg = scanner.nextDouble();

        double totalAmount= pricePerKg * quantityKg;

        double discount = totalAmount * 0.10;

        double finalAmount =totalAmount - discount;

        System.out.println("Total amount to pay after 10%discount:"+ finalAmount);

        
    }

}
