import java.util.Scanner;

public class Bp10 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int deliveries = sc.nextInt();
        int payOut = sc.nextInt();
        int incentive = sc.nextInt();
        int fuelCost = sc.nextInt();

        int result1 = deliveries*payOut;
        int result2 = result1+incentive -fuelCost;

        System.out.print("Driver Earnings = ");
        System.out.println(result2);

        sc.close();
    }
    
}
