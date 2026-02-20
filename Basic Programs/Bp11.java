import java.util.Scanner; 

public class Bp11 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        int distance = sc.nextInt();
        int rate = sc.nextInt();
        int maintenance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();

        int result1 = distance*rate;
        int result2 = result1+maintenance;
        int result3 = result2+allowance-subsidy;

        System.out.print("Total Transport Fee = ");
        System.out.println(result3);

    }
}
