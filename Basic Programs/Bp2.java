import java.util.Scanner;

public class Bp2 {
    public static void main(String[] args) {
         
        Scanner sc =new Scanner(System.in);

        double base =sc.nextInt();
        double extra=sc.nextInt();
        double rate=sc.nextInt();
        double tax=sc.nextInt();


        double mul=extra*rate;
        double total=base+mul;
        double end=total+(total*tax/100);
        System.out.printf("Total Bill = %.2f", end);

    }
}


