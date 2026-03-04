import java.util.Scanner;

public class Csp11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String order_Type = sc.nextLine();
        String loyalty_Status = sc.nextLine();
        double order_Value = sc.nextDouble();
        sc.nextLine();
        String time_Slot = sc.nextLine();

        int base_dis = 0;

        if (loyalty_Status.equals("Gold")){
            base_dis = 15;
        }
        else if (loyalty_Status.equals("Silver")){
            base_dis = 10;
        }
        else if (loyalty_Status.equals("Bronze")){
            base_dis = 5;
        }
        else if (loyalty_Status.equals("None")){
            base_dis = 0;
        }

        int time_base = base_dis + 0;

        if (time_Slot.equals("Peak")){
            time_base = 0;
        }
        else if (time_Slot.equals("Regular")){
            time_base = 0;
        }
        else if(time_Slot.equals("Late-Night")){
            time_base = -5;
        }

        int service_fee = 0;

        if(order_Type.equals("Delivery")){
            service_fee = 10 ;
        }
        else if (order_Type.equals("Takeout")){
            service_fee = 3;
        }
        else if (order_Type.equals("Dine-In")){
            service_fee = 0;
        }

         double dis_val = order_Value * (1- base_dis / 100.0);
         double final_amt = dis_val + service_fee;

         String kitchen = "Medium";
         
         if(time_Slot.equals("Peak hours") && order_Type.equals("Delivery")){
            kitchen = "High";  
         }
         else if (time_Slot.equals("Regular hours")){
            kitchen = "Medium";
         }
         else if (time_Slot.equals("Late-Night")){
            kitchen ="Low";
         }

         
      int min = 0;
      if(order_Type.equals("Dine-In") && kitchen.equals("Medium"))
      {
        min = 25;
      }else if(order_Type.equals("Delivery") && kitchen.equals("High"))
      {
        min = 30;
      }else if(order_Type.equals("Takeout") && kitchen.equals("Low"))
      {
        min = 15;
      }
      System.out.println("===============================");
      System.out.println("Order Type: " +order_Type);
      System.out.println("Loyalty Status: " +loyalty_Status);
      System.out.println("Order Value: $" +order_Value);
      System.out.println("Time Slot: " +time_Slot);
      System.out.println("Base Discount: " +base_dis+"%");
      System.out.println("Time-based adjustment :"+time_base+"%");
      System.out.println("Service Fee: $"+service_fee);
      System.out.println("Final Amount : $"+(float)final_amt);
      System.out.println("Kitchen Priority: "+kitchen);
      System.out.println("Estimate Prep Time :"+min+ "minutes");
      System.out.print("====================================");

        

        

        sc.close();
    }
}
