import java.util.Scanner;

public class Op13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int connectionValue =sc.nextInt();
        int appliance = sc.nextInt();
        if((connectionValue & appliance)!=0){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
        sc.close();
    }
}
