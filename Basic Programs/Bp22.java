import java.util.Scanner;

public class Bp22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Values : ");

        int copies = sc.nextInt();
        int cost = sc.nextInt();
        int editing = sc.nextInt();
        int design = sc.nextInt();
        int commission = sc.nextInt();
        int marketing = sc.nextInt();

        int res1 = copies * cost ; 
        int res2 = res1 + editing + design ;
        int res3 = res2 - commission - marketing ;

        System.out.print("Publishing Profit is : ");
        System.out.println(res3);

    }
}
