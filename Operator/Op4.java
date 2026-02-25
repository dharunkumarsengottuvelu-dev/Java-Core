import java.util.Scanner;

public class Op4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Credit Limit : ");
        int creditLimit = sc.nextInt();

        System.out.print("Enter The Purchase Amount : ");
        int purchaseAmt = sc.nextInt();

        System.out.print("Enter The Card Blocked (0 = No, 1 = Yes) : ");
        int cardBlocked = sc.nextInt();

        if (purchaseAmt <= creditLimit && cardBlocked == 0) {
            System.out.println("Approved");
        } else {
            System.out.println("Declined");
        }

        sc.close();
    }
}