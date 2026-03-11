import java.util.Scanner;


public class Bp4 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double tuitionfee=sc.nextDouble();
        double scholarship=sc.nextDouble();
        double examfee=sc.nextDouble();
        double libraryfee=sc.nextDouble();

        double samount=(tuitionfee*scholarship)/100;
        double atamount=tuitionfee-samount;
        double end=atamount+examfee+libraryfee;;

        System.out.printf("%.0f",end);


        sc.close();

        
    }
    

}
