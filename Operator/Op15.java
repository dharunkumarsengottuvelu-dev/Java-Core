import java.util.Scanner;

public class Op15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int signal = sc.nextInt();
        int toggle = sc.nextInt();
        int val = signal ^ toggle;
        System.out.println("Toggled Signal = " + val);
    

        sc.close();
    }

}
