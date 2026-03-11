import java.util.Scanner;

public class Bp9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int roomCharge = sc.nextInt();
        int days = sc.nextInt();
        int medicieCost = sc.nextInt();
        int labFee = sc.nextInt();
        int insurance = sc.nextInt();
        
        int result1 =roomCharge*days;
        int result2 = result1+medicieCost;
        int result3 = result2+labFee-insurance;

        System.out.print("Payable Amount = ");
        System.out.println(result3);

        sc.close();
    }
    
}
