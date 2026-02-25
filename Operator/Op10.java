import java.util.Scanner;

public class Op10 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter Units Consumed : ");
         int units = sc.nextInt();

         System.out.print("Enter the Voltage (1/0) : ");
         int voltage = sc.nextInt();

         if(units > 500 || voltage ==1){
        
            System.out.print("Alter Triggered");

         }else{

            System.out.println("Normal Usage");

         }
  
         sc.close();

    }
}
