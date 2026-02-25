import java.util.Scanner;

public class Op9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User Name (0/1) : ");
        int usernameMatch = sc.nextInt();
        System.out.print("Enter the User Password (0/1) : ");
        int passwordMatch = sc.nextInt();
        System.out.print("Enter the Account Locked (0/1) : ");
        int accountLocked = sc.nextInt();

        if (usernameMatch == 1 && passwordMatch == 1 && !(accountLocked == 1)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}