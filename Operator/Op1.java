import java.util.Scanner;

public class Op1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Theory Mark : ");
        int theoryMarks = sc.nextInt();
        System.out.print("Enter the Practical Mark : ");
        int practicalMarks = sc.nextInt();

        double average = (theoryMarks + practicalMarks) / 2.0;

        if (theoryMarks >= 50 && practicalMarks >= 50 && average >= 60) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

        sc.close();
    }
}