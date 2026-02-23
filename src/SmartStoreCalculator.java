import java.util.Locale;
import java.util.Scanner;

public class SmartStoreCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("==== SMART STORE CALCULATOR ====");

        System.out.print("Product name: ");
        String productName = input.nextLine();

        System.out.print("Unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Quantity purchased: ");
        int quantityPurchased = input.nextInt();

        System.out.print("Discount percentage: ");
        int discountPercentage = input.nextInt();

        System.out.print("Number of installments: ");
        int numberOfInstallments = input.nextInt();

        double grossTotal = unitPrice * quantityPurchased;
        double discountValue = grossTotal * (discountPercentage / 100.0);
        double finalTotalWithDiscount = grossTotal - discountValue;
        double installmentAmount = finalTotalWithDiscount / numberOfInstallments;
    }
}
