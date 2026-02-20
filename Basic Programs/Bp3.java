import java.util.Scanner;

public class Bp3 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sales, Discount and GST :");

        double sales = scan.nextDouble();
        double discount = scan.nextDouble();
        double gst = scan.nextDouble();


        double discountAmount = (sales * discount) / 100;
        double amountAfterDiscount = sales - discountAmount;
        double gstAmount = (amountAfterDiscount * gst) / 100;
        double revenue = amountAfterDiscount + gstAmount;

        System.out.printf("Final Revenue is : %.0f",revenue);
        scan.close();
    }
}
