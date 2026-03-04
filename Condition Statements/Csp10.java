import java.util.Scanner;
public class Csp10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();

        double power = sc.nextDouble();
        double renewable = sc.nextDouble();
        
        sc.nextLine();
        String rate = sc.nextLine();


        double br = 0.0;

        if (rate.equals("Basic")){
            br=0.18;
        }
        else if (rate.equals("Time-of-Use")){
            br=0.15;
        }
        else if(rate.equals("Premium-Green")){
            br=0.12;
        }

        double rate_mul = 0.0;

         if(timeOfDay.equals("Peak"))
        {
            rate_mul = 1.5;
        }
        else if (timeOfDay.equals("Off-Peak")){
            rate_mul = 0.8;
        }
        else if (timeOfDay.equals("Supper-Off-Peak")){
            rate_mul = 0.5;
        }
        
         double ren_cre = (power * renewable / 100) * br;
       
         double cost = (power * br * rate_mul) - ren_cre;

        System.out.println("======================================");
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + power+"kWh");
        System.out.println("Renewable Energy :"+renewable+"%");
        System.out.println("Rate Tier:"+rate);
        System.out.println("Base Rate:$" +br+"/kWh");
        System.out.println("Rate Multiplier: " +rate_mul+"x");
        System.out.println("Renewable Credit: $" + ren_cre);
        System.out.println("Total Cost : $"+(float)cost);
         System.out.print("======================================");


        sc.close();
    }
}
