import java.util.Scanner;

public class Csp9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double annualRevenue = sc.nextDouble();
        sc.nextLine();  

        String businessType = sc.nextLine();

        double expenses = sc.nextDouble();
        double tax = sc.nextDouble();

        double income = annualRevenue - expenses;

        double tax_rate = 0.0;

        if (businessType.equalsIgnoreCase("C-Corp")) {
            if (income < 500000) {
                tax_rate = 21;
            } else if (income < 1000000) {
                tax_rate = 24;
            } else if (income < 2000000) {
                tax_rate = 28;
            } else {
                tax_rate = 30;
            }

        } else if (businessType.equalsIgnoreCase("S-Corp")) {

            if (income < 500000) {
                tax_rate = 20;
            } else if (income < 1000000) {
                tax_rate = 25;
            } else {
                tax_rate = 28;
            }

        } else if (businessType.equalsIgnoreCase("LLC")) {

            if (income < 200000) {
                tax_rate = 15;
            } else if (income < 500000) {
                tax_rate = 18;
            } else {
                tax_rate = 22;
            }

        } else if (businessType.equalsIgnoreCase("Partnership")) {

            if (income < 300000) {
                tax_rate = 18;
            } else if (income < 800000) {
                tax_rate = 22;
            } else {
                tax_rate = 26;
            }
        }

        double gross_tax = income * (tax_rate / 100);
        double net_tax = gross_tax - tax;
        double eff_rate = (net_tax / annualRevenue) * 100;

        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + expenses);
        System.out.println("Tax Credits: $" + tax);
        System.out.println("Taxable Income: $" + income);
        System.out.println("Tax Rate: " + (int) tax_rate + "%");
        System.out.println("Gross Tax: $" + gross_tax);
        System.out.println("Net Tax After Credits: $" + net_tax);
        System.out.printf("Effective Tax Rate: %.2f%%", eff_rate);

        sc.close();
    }
}