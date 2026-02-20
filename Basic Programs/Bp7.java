import java.util.Scanner;

public class Bp7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int dayworked = sc.nextInt();
        int wageperday = sc.nextInt();
        int overtime = sc.nextInt();
        int maintain = sc.nextInt();

        int base =dayworked*wageperday;
        int addBouns = base+overtime;
        int deduct = addBouns - maintain;

        System.out.print("Final Weekly Wages = ");
        System.out.println(deduct);


    }
    
}
