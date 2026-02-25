import java.util.Scanner;

public class Op6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter The Family Income : ");
        int income = sc.nextInt();

        System.out.print("Enter The Percentage : ");
        int percent = sc.nextInt();

        if (income < 200000 && percent >= 75){

            System.out.println("Scholarship Granted");

        }else{

            System.out.println("Not Granted");

        }

        sc.close();
    }
    
}
