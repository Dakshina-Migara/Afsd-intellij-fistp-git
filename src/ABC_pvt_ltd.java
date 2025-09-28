import java.util.Scanner;

public class ABC_pvt_ltd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tax = 0.0;

        for (int i = 0; i < 12; i++) {
            System.out.print("enter the employee salary: ");
             double salary = scan.nextDouble();

            if (salary >= 130000.00) {
                 tax += (salary * 14 / 100);
            }
        }
        System.out.println(" Total tax amount: " + tax);
    }
}