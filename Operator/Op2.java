import java.util.Scanner;

public class Op2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Account Balance : ");
        int accBalance = sc.nextInt();

        System.out.print("Enter the Withdral Amount : ");
        int withdrawal = sc.nextInt();

        System.out.print("Enter The Daily Limit : ");
        int dailylimit = sc.nextInt();

        if (accBalance > withdrawal && withdrawal <= dailylimit){

            System.out.println("Approved");

        }else {
            System.out.println("Declined");
        }
        sc.close();
    }
    
}
