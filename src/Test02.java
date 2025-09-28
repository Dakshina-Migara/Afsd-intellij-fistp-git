
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st business man income Rs. ");
        double salary1 = scan.nextDouble();

        System.out.print("Enter the 2nd business man income Rs. ");
        double salary2 = scan.nextDouble();

        System.out.print("Enter the 3rd business man income Rs. ");
        double salary3 = scan.nextDouble();

        System.out.print("Enter the 4st business man income Rs. ");
        double salary4 = scan.nextDouble();

        System.out.println("Business man average income per month - " + (salary1 + salary2 + salary3 + salary4) / 4);

        System.out.println("total of Business mans pay tax for government -" + ((salary1 * 13 / 100) + (salary2 * 13 / 100) + (salary3 * 13 / 100) + (salary4 * 13 / 100)));
    }
}