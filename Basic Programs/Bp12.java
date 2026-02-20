import java.util.Scanner;

public class Bp12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ticket = sc.nextInt();
        int snack = sc.nextInt();
        int maintenance = sc.nextInt();
        int electricity = sc.nextInt();

        int result1 = ticket + snack - maintenance - electricity;

        System.out.print("Net Profit is : ");
        System.out.println(result1);

        sc.close();
    }    
}