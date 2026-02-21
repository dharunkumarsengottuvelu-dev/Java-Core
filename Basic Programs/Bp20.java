import java.util.Scanner;

public class Bp20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Values : ");

        int ads = sc.nextInt();
        int sponsor = sc.nextInt();
        int affiliate = sc.nextInt();
        int tax = sc.nextInt();
        int production = sc.nextInt();

        int res1 = ads + sponsor;
        int res2 = res1 + affiliate;
        int res3 = res2 - tax - production;

        System.out.print("Final Youtube Income : ");
        System.out.println(res3);


    }
    
}
