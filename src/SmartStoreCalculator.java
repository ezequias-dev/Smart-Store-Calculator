import java.util.Locale;
import java.util.Scanner;

public class SmartStoreCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char moneySymbol = '$';
        char percentageSymbol = '%';
        char xSymbol = 'x';

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

        System.out.println("==== ORDER/S ====");
        System.out.println("Product name: " + productName);
        System.out.printf("Unit price: %c%.2f%n", moneySymbol, unitPrice);
        System.out.println("Quantity purchased: " + quantityPurchased);
        System.out.printf("Discount percentage: %d%c%n", discountPercentage, percentageSymbol);
        System.out.printf("Number of installments: %d%c%n", numberOfInstallments, xSymbol);
        System.out.println();
        System.out.printf("Gross total: %c%.2f%n", moneySymbol, grossTotal);
        System.out.printf("Discount value: %c%.2f%n", moneySymbol, discountValue);
        System.out.printf("Total value with discount: %c%.2f%n", moneySymbol, finalTotalWithDiscount);
    }
}
