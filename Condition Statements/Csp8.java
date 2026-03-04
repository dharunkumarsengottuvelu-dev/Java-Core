import java.util.Scanner;

public class Csp8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String location = sc.nextLine();
        int sqft = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double price = 0.0;

        if (location.equalsIgnoreCase("Prime")) {
            price = 400.0;
        } 
        else if (location.equalsIgnoreCase("Urban")) {
            price = 300.0;
        } 
        else if (location.equalsIgnoreCase("Suburban")) {
            price = 180.0;
        } 
        else if (location.equalsIgnoreCase("Rural")) {
            price = 100.0;
        }

        double per = 0.0;

        if (propertyAge <= 5) {
            per = 0;
        } 
        else if (propertyAge <= 10) {
            per = -5;
        } 
        else if (propertyAge <= 15) {
            per = -10;
        } 
        else if (propertyAge <= 30) {
            per = -15;
        } 
        else {
            per = -25;
        }

        double baseValue = sqft * price;

        double adjustedValue = baseValue * (1 + per / 100);

        double amenityBonus = 0.0;

        if (amenityScore >= 80)
            amenityBonus = baseValue * 0.10;
        else if (amenityScore >= 60)
            amenityBonus = baseValue * 0.05;
        else if (amenityScore >= 40)
            amenityBonus = baseValue * 0.02;
        else
            amenityBonus = 0;

        double finalPrice = adjustedValue + amenityBonus;

        String market;

        if ((location.equalsIgnoreCase("Prime") || location.equalsIgnoreCase("Urban")) 
                && propertyAge < 15)
            market = "Hot";
        else if (location.equalsIgnoreCase("Suburban"))
            market = "Stable";
        else
            market = "Slow";

        System.out.println("Location Tier: " + location);
        System.out.println("Square Footage: " + sqft + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + price);
        System.out.println("Age Adjustment: " + (int) per + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalPrice);
        System.out.println("Market Category: " + market);

        sc.close();
    }
}