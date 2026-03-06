import java.util.Scanner;
public class Csp16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String room_cat = sc.nextLine();
        String season = sc.nextLine();
        int nightBook = sc.nextInt();
        sc.nextLine();
        String loyalty = sc.nextLine();


        int base_rate = 0;

        if (room_cat.equals("Standard")){
            base_rate = 150;
        }
        else if (room_cat.equals("Deluxe")){
            base_rate = 300;
        }
        else if (room_cat.equals("Suite")){
            base_rate = 500;
        }
        else if (room_cat.equals("Presidential")){
            base_rate =1000;
        }

        double sea_mul= 0.0;

        if (season.equals("Off-Peak")){
            sea_mul = 0.7;
        }
        else if (season.equals("Regular")){
            sea_mul = 1.0;
        }
        else if (season.equals("Peak")){
            sea_mul = 1.5;
        }
        else if (season.equals("Holiday")){
            sea_mul = 2.0;
        }

        int stay_dis =0;

        if (nightBook > 0 && nightBook <=4){
            stay_dis =0 ;
        }
        else if (nightBook >= 5 && nightBook <= 7 ){
            stay_dis = 5;
        }
        else if (nightBook >=8 && nightBook <= 14){
            stay_dis = 10;
        }
        else if (nightBook >= 15){
            stay_dis = 20;
        }

        int loyalty_dis =0;

        if (loyalty.equals("None")){
            loyalty_dis = 0;
        }
        else if (loyalty.equals("Member")){
            loyalty_dis = 10;
        }
        else if (loyalty.equals("Gold")){
            loyalty_dis = 15;
        }
        else if (loyalty.equals("Platinum")){
            loyalty_dis = 20;
        }

        double sea_rate = base_rate * sea_mul;
        double dis_rate = sea_rate * (1-loyalty_dis/100.0) * (1-loyalty_dis/100.0);
        double total_cost = dis_rate * nightBook;

          String cat = "None";
        if((loyalty.equals("Member")) && (room_cat.equals("Suite")))
        {
            cat = "Free breakfast";
        }else if((loyalty.equals("Gold")) && (room_cat.equals("Deluxe")))
        {
            cat = "Free breakfast and spa access";
        }

        System.out.println("Room Category: "+room_cat);
        System.out.println("Season: "+season);
        System.out.println("Nights Booked: " +nightBook);
        System.out.println("Loyalty Tier: " +loyalty);
        System.out.println("Base Rate Per Night: $"+base_rate);
        System.out.println("Seasonal Multiplier: "+ sea_mul+"x");
        System.out.println("Extended Stay Discount: " + stay_dis + "%");
        System.out.println("Loyalty Discount: "+loyalty_dis + "%");
        System.out.println("Nightly Rate: $" + dis_rate);
        System.out.println("Total Booking Cost: $" + total_cost);
        System.out.println("Complimentary Upgrades: "+cat);


        
        sc.close();
    }
}
