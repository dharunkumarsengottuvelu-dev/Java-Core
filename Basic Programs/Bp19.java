import java.util.Scanner;

public class Bp19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the values : ");

        int days = sc.nextInt();
        int rent = sc.nextInt();
        int late = sc.nextInt();
        int fule = sc.nextInt();
        int maintenance = sc.nextInt();

        int res1 = days*rent;
        int res2 = res1 +late;
        int res3 = res2 - fule - maintenance;

        System.out.print("Net Profit is : ");
        System.out.println(res3);

        sc.close();
    }
    
}
