import java.util.Scanner;

public class Op14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perA = sc.nextInt();
        int perB= sc.nextInt();
        int val = perA | perB;
        System.out.println("Merged Permission Code = " + val);

        sc.close();
    }
}
