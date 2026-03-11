import java.util.Scanner;

public class pb11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String seatType, customerType;

        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 0; i < N; i++) {

            seatType = sc.next();
            customerType = sc.next();

            double basePrice = 0;
            double discountPercent = 0;

            if (seatType.equals("Regular"))
                basePrice = 12;
            else if (seatType.equals("Premium"))
                basePrice = 18;
            else if (seatType.equals("Recliner"))
                basePrice = 25;

            if (customerType.equals("Child"))
                discountPercent = 30;
            else if (customerType.equals("Senior"))
                discountPercent = 25;
            else
                discountPercent = 0;

            double finalPrice = basePrice * (1 - discountPercent / 100);

            System.out.println("Ticket " + (i + 1) + ": " + seatType + " - " + customerType);
            System.out.printf("Base Price: $%.1f\n", basePrice);
            System.out.printf("Discount: %.0f%%\n", discountPercent);
            System.out.printf("Final Price: $%.1f\n\n", finalPrice);

            originalTotal += basePrice;
            finalTotal += finalPrice;
        }

        int groupApplied = 0;

        if (N >= 5) {
            finalTotal = finalTotal * 0.90;
            groupApplied = 1;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("Total Tickets: " + N);
        System.out.printf("Original Total: $%.1f\n", originalTotal);
        System.out.printf("Total Discount: $%.1f\n", totalDiscount);
        System.out.printf("Final Total: $%.1f\n", finalTotal);

        if (groupApplied == 1)
            System.out.println("Group Discount Applied: Yes");
        else
            System.out.println("Group Discount Applied: No");

        sc.close();
    }
}