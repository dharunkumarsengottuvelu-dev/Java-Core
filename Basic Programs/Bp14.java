import java.util.Scanner;

public class Bp14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Values : ");

        int base = sc.nextInt();
        int session = sc.nextInt();
        int Payper = sc.nextInt();
        int bouns = sc.nextInt();
        int maintenance = sc.nextInt();

        int res1 = base + (session * Payper);
        int res2 = res1 + bouns-maintenance;

        System.out.print("Final Salary is : ");
        System.out.println(res2);
        
        sc.close();
        
    }    
}
