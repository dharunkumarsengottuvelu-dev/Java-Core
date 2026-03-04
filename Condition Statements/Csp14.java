import java.util.Scanner;
public class Csp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String member_ship = sc.nextLine();
        int con_months = sc.nextInt();
        sc.nextLine();
        String accessLevel = sc.nextLine();
        String addons = sc.nextLine();

        double monthly_fee = 0;
    
        if (member_ship.equals("Base")){
            monthly_fee = 40;
        }
        else if (member_ship.equals("Premium")){
            monthly_fee = 80;
        }
        else if (member_ship.equals("Elite")){
            monthly_fee = 120;
        }
        else if (member_ship.equals("VIP")){
            monthly_fee = 150;
        }
        
        int dis =0;

        if (con_months==1){
            dis =0;
        }
        else if (con_months==6){
            dis = 10;
        }
        else if (con_months==12){
            dis =15;
        }
        else if (con_months==24){
            dis =25;
        }

        int acc_fee =0;

        if(accessLevel.equals("Single-Location")){
            acc_fee =0;
        }
        else if (accessLevel.equals("Regional")){
            acc_fee = 20;
        }
        else if (accessLevel.equals("Nationalwide")){
            acc_fee =50;
        }

        int addonfee = 0;

        if(addons.equals("None")){
            addonfee = 0;
        }
        else if (addons.equals("Personal_Training")){
            addonfee =100;
        }
        else if (addons.equals("Classes")){
            addonfee = 50;
        }
        else if (addons.equals("Full-Package")){
            addonfee = 200;
        }

        double disbase = monthly_fee * (1 - dis / 100.0);
        double montotal = disbase + acc_fee + addonfee;
        double contotal = montotal * con_months;
        double savings = (monthly_fee + acc_fee + addonfee) * con_months - contotal;

        
        String membership = "Premium";
        if(con_months == 1)
        {
            membership = "Budget";
        }
        else if(con_months == 6)
        {
            membership = "standrard";
        }else if(con_months == 12)
        {
            membership = "Premium";
        }else if(con_months == 24)
        {
            membership = "Luxuary";
        }

        System.out.println("Membership Tier: " + member_ship);
        System.out.println("Contract Length: " +con_months);
        System.out.println("Access Level: " +accessLevel);
        System.out.println("Add-Ons: " + addons);
        System.out.println("Base Monthly Fee: $" + monthly_fee);
        System.out.println("Contract Discount : "+dis+"%");
        System.out.println("Access Fee: $" +acc_fee);
        System.out.println("Add-On Fee: $" + addonfee);
        System.out.println("Monthly Total : $"+montotal);
        System.out.println("Contract Total: $"+contotal);
        System.out.println("Savings vs Month-to-Month: $"+savings);
        System.out.println("Membership category : " + membership);
        
        sc.close();
    }
}
