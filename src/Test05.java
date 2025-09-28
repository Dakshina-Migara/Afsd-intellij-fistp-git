import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the salary = ");
        double salary = scan.nextDouble();

        System.out.print("Enter the land sale =");
        double land = scan.nextDouble();

        System.out.print("Enter the kudu income = ");
        double kudu = scan.nextDouble();

        if (salary >= 115000) {
            salary = salary - (salary / 100 * 14);
        }

        if (kudu >= 0) {
            kudu = kudu - (kudu / 100 * 50);
        }

        System.out.println("Total Income = " + (salary + kudu + land));
        System.out.println(kudu);
    }
}
