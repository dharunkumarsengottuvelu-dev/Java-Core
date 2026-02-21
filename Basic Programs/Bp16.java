import java.util.Scanner;

public class Bp16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Values :");

        int genPass = sc.nextInt();
        int genfare = sc.nextInt();
        int acPass = sc.nextInt();
        int acFare = sc.nextInt();
        int platform = sc.nextInt();
        int maintenance = sc.nextInt();
        int fuel = sc.nextInt();

        int res1 = genPass*genfare;
        int res2 = res1 + acPass * acFare;
        int res3 = res2 + platform - maintenance-fuel;
        
        System.out.print("Net Raliway Revenue is  : ");
        System.out.println(res3);
    }
    
}
