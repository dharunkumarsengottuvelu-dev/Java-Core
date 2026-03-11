import java.util.Scanner;

public class pb10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String itemName;
        double price;
        int quantity;

        double subtotal = 0;
        int totalItems = 0;

        for (int i = 0; i < N; i++) {

            itemName = sc.next();
            price = sc.nextDouble();
            quantity = sc.nextInt();

            double itemTotal = price * quantity;

            System.out.println("Item: " + itemName);
            System.out.printf("Price: $%.1f x %d\n", price, quantity);
            System.out.printf("Subtotal: $%.1f\n\n", itemTotal);

            subtotal += itemTotal;
            totalItems += quantity;
        }

        double tax = subtotal * 0.08;
        double serviceCharge = subtotal * 0.10;
        double grandTotal = subtotal + tax + serviceCharge;

        System.out.println("Total Items: " + totalItems);
        System.out.printf("Subtotal: $%.1f\n", subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Service Charge (10%%): $%.2f\n", serviceCharge);
        System.out.printf("Grand Total: $%.2f\n", grandTotal);

        sc.close();
    }
}