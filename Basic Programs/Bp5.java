import java.util.Scanner;

public class Bp5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double totalbill = sc.nextDouble();
        double service = sc.nextDouble();
        double gst = sc.nextDouble();
        double people = sc.nextDouble();

        double serviceAmt = (totalbill * service) / 100;
        double afterService = totalbill + serviceAmt;
        double gstAmount = (afterService * gst) / 100;
        double finalAmt = afterService + gstAmount;
        double perPerson = finalAmt / people;

        System.out.printf("%.0f", perPerson);

        sc.close();
    }
}
