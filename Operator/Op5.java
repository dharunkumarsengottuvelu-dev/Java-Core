import java.util.Scanner;

public class Op5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Salary : ");
        int salary = sc.nextInt();

        System.out.print("Enetr The Credit Score : ");
        int creditScore = sc.nextInt();

        if (salary > 25000 && creditScore > 700){

            System.out.println("Loan Approved");

        }else{

            System.out.println("Loan Rejected");
        }

        sc.close();
    }
    
}
