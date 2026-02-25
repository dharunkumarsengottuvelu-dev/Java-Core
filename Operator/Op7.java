import java.util.Scanner;

public class Op7 {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Cart Value : ");
        int freeShipping = sc.nextInt();

        System.out.print("Premium Member (1/0) : ");
        int shippingCharges = sc.nextInt();

        if (freeShipping > 999 || shippingCharges == 1){

            System.out.println("Free Shipping Appiled");
        
        }else{

            System.out.println("Shipping Charges Applied");
    }
     sc.close();
    }
}
