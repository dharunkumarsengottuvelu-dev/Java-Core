import java.util.Scanner;

public class Bp13 {
    public static void main(String[] args) {
        
    
   {
        Scanner sc = new Scanner(System.in);

        int yield = sc.nextInt();
        int acres = sc.nextInt();
        int extra = sc.nextInt();
        int damaged = sc.nextInt();

        int res1=(yield*acres)+extra-damaged;
        

        System.out.print("Marketable Yield :");
        System.out.println(res1);
    }
    
    }
}
