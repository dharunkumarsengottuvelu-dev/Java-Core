import java.util.Scanner;

public class Csp12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();   // Consume leftover newline

        String vehicle_type = sc.nextLine();
        String record = sc.nextLine();
        String coverage = sc.nextLine();

        double base_pre = 0.0;

        if (coverage.equals("Base")) {
            base_pre = 500.0;
        } 
        else if (coverage.equals("Standard")) {
            base_pre = 800.0;
        } 
        else if (coverage.equals("Comprehensive")) {
            base_pre = 1500.0;
        }

        double age_fact = 0.0;

        if (age >= 16 && age <= 21) {
            age_fact = 1.8;
        } 
        else if (age >= 22 && age <= 25) {
            age_fact = 1.5;
        } 
        else if (age >= 26 && age <= 40) {
            age_fact = 1.0;
        } 
        else if (age >= 41 && age <= 60) {
            age_fact = 0.9;
        } 
        else if (age >= 61) {
            age_fact = 1.1;
        }

        double vehicle_risk = 0.0;

        if (vehicle_type.equals("Sedan")) {
            vehicle_risk = 1.0;
        } 
        else if (vehicle_type.equals("SUV")) {
            vehicle_risk = 1.2;
        } 
        else if (vehicle_type.equals("Sports")) {
            vehicle_risk = 1.5;
        } 
        else if (vehicle_type.equals("Truck")) {
            vehicle_risk = 1.1;
        }

        int rec_adj = 0;

        if (record.equals("Clean")) {
            rec_adj = -10;
        } 
        else if (record.equals("Minor-Violations")) {
            rec_adj = 25;
        } 
        else if (record.equals("Major-Violations")) {
            rec_adj = 50;
        }

        double adj_pre = base_pre * age_fact * vehicle_risk;
        double final_pre = adj_pre * (1 + rec_adj / 100.0);
        double mon_pre = final_pre / 12;

        String r_f;

        if (age_fact >= 1.8 || vehicle_risk >= 1.5) {
            r_f = "Very High";
        } 
        else if (age_fact >= 1.5) {
            r_f = "High";
        } 
        else if (age_fact >= 1.1) {
            r_f = "Medium";
        } 
        else {
            r_f = "Low";
        }

        System.out.println("Driver Age : " + age);
        System.out.println("Vehicle Type : " + vehicle_type);
        System.out.println("Driving Record : " + record);
        System.out.println("Coverage Level : " + coverage);
        System.out.println("Base Premium : $" + base_pre);
        System.out.println("Age Factor : " + age_fact + "x");
        System.out.println("Vehicle Risk Factor : " + vehicle_risk + "x");
        System.out.println("Record Adjustment : " + rec_adj + "%");
        System.out.println("Monthly Premium : $" + (float) mon_pre);
        System.out.println("Annual Premium : $" + (float) final_pre);
        System.out.println("Risk Category : " + r_f);

        sc.close();
    }
}