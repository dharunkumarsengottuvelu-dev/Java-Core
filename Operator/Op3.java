import java.util.Scanner;

public class Op3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter The Working Hours : ");
        int workingHours = sc.nextInt();

        System.out.print("Enter The Attendance Percentage : ");
        int attendance = sc.nextInt();

        if (workingHours > 40 && attendance >90 ){

            System.out.print("Bonus Eligible");

        }else{
            System.out.print("Not ELigible");
        }

        sc.close();
    }
    


}
