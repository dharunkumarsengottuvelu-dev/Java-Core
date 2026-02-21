import java.util.Scanner;

public class Bp24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Values : ");

        int register = sc.nextInt();
        int broadcast = sc.nextInt();
        int sponsor = sc.nextInt();
        int prize = sc.nextInt();
        int rent = sc.nextInt();
        int advertising = sc.nextInt();


        int res1 = register + broadcast + sponsor;
        int res2 = res1 - prize - rent - advertising;

        System.out.print("Remaining Tournament fund is : ");
        System.out.println(res2);
        

    }
    
}
