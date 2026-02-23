import java.util.Scanner;

public class SmartStoreCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==== SMART STORE CALCULATOR ====");

        System.out.print("Product name: ");
        String productName = input.nextLine();

        System.out.print("Unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Quantity purchased: ");
        int quantityPurchased = input.nextInt();
    }
}
