import java.util.Scanner;

public class Bp23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter The values : ");

        int weight = sc.nextInt();
        int rate = sc.nextInt();
        int priority = sc.nextInt();
        int insurance = sc.nextInt();
        int handling = sc.nextInt();
        int fule = sc.nextInt();


        int res1 = weight * rate ; 
        int res2 = res1 + priority + insurance;
        int res3 = res2 - handling - fule;

        System.out.print("Cargo Revenue : ");
        System.out.println(res3);

    }
    
}
