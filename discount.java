//Program to compute discount
/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024
*Description: Program to compute discount
*/
import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Discount;
        //prompt user to enter amount
        System.out.println("Enter the amount purchased:");
        double amount = scanner.nextDouble();

        if(amount>5000){
            Discount = amount * 0.1;
        }
        else if(amount>=1000 && amount<=5000){
            discount = amount * 0.05;
        }
        else{
            discount = 0;
        }
        double totalAmount = amount - discount;
        System.out.println("The discount is: " + discount);
        System.out.println("Discountn "+discount);
        system.out.println("Amount to pay " + amountTopay );

        scanner.close();
    }
}