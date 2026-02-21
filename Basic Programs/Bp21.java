import java.util.Scanner;

public class Bp21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Values : ");

        int maintenance = sc.nextInt();
        int parking = sc.nextInt();
        int hall = sc.nextInt();
        int security = sc.nextInt();
        int electricity = sc.nextInt();
        int cleaning = sc.nextInt();
        
        int res1 = maintenance+parking+hall;
        int res2 = res1 - security - electricity - cleaning;
        

        System.out.print("Remaining Balance is : ");
        System.out.println(res2);
    }   
}
