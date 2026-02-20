import java.util.Scanner;

public class Bp15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Values : ");

        int rooms = sc.nextInt();
        int price = sc.nextInt();
        int service = sc.nextInt();
        int commission = sc.nextInt();

        int res= (rooms * price) + service - commission;

        System.out.print("Total Revenue : ");
        System.out.println(res);

        
    }
}