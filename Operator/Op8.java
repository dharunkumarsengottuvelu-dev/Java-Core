import java.util.Scanner;

public class Op8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter The Age : ");
        int age = sc.nextInt();

        System.out.print("Enter The Id Proof (0/1) : ");
        int id = sc.nextInt();

        if (age >=18 && id == 1){

            System.out.println("Allowed");

        }else{

            System.out.println("Denied");

        }
        sc.close();
    }

}
