import java.util.Scanner;

public class IT24400066Lab3Q2 {
   public static void main(String [] args) {
       Scanner Scanner = new Scanner(System.in);

       System.out.print("Enter the monthly salary: ");
       double monthlySalary = Scanner.nextDouble();

       System.out.print("Enter the number of OT hours:" );
       int otHours = Scanner.nextInt();

       System.out.print("Enter the OT hourly rate:");
       double otHourlyRate = Scanner.nextDouble();

       double otAmount = otHours * otHourlyRate;

       double totalSalary = monthlySalary + otAmount;

       System.out.println("Total salary (including OT):" + totalSalary);



   }
}
