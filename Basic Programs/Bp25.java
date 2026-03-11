import java.util.Scanner;
public class Bp25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Values : ");

        int resUsage = sc.nextInt();
        int resRate = sc.nextInt();
        int comUsage = sc.nextInt();
        int comRate = sc.nextInt();
        int connection = sc.nextInt();
        int penalty = sc.nextInt();
        int maintenance = sc.nextInt();
        int treatment = sc.nextInt();

        int res1 = (resUsage * resRate) + (comUsage * comRate);
        int res2 = res1 + connection + penalty;
        int res3 = res2 - maintenance - treatment;

        System.out.print("Net Water Revenue is : ");
        System.out.println(res3);

        sc.close();
    }
    
}
