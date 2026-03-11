import java.util.Scanner;

public class Bp8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rodsperhour=sc.nextInt();
        int hoursWorked=sc.nextInt();
        int overtime=sc.nextInt();
        int rejectedRods=sc.nextInt();

        int result=(rodsperhour*hoursWorked)+overtime-rejectedRods;

        System.out.print("Usable Rods = ");
        System.out.println(result);
        sc.close();
    }
    
}
