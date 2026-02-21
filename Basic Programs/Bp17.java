import java.util.Scanner;

public class Bp17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Values : ");

        int hours = sc.nextInt();
        int rate = sc.nextInt();
        int design = sc.nextInt();
        int testing = sc.nextInt();
        int advance = sc.nextInt();

        int res1 = hours*  rate;
        int res2 = res1 + design;
        int res3 = res2 + testing-advance;

        System.out.print("Final Project Cost is : ");
        System.out.println(res3);


    }
    
}
