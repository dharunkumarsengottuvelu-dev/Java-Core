import java.util.Scanner;

public class Bp18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Values : ");

        int register = sc.nextInt();
        int sponsor = sc.nextInt();
        int stall = sc.nextInt();
        int stage = sc.nextInt();
        int celebrity = sc.nextInt();
        int marketing = sc.nextInt();

        int res1 = register + sponsor;
        int res2 = res1 + stall;
        int res3 = res2 - stage - celebrity - marketing;

        System.out.print("Remaining Fund is :");
        System.out.println(res3);

        sc.close();
    }
}
