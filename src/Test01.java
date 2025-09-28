import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st employee salary Rs. ");
        double salary1 = scan.nextDouble();

        System.out.print("Enter the 2nd employee salary Rs. ");
        double salary2 = scan.nextDouble();

        System.out.print("Enter the 3rd employee salary Rs. ");
        double salary3 = scan.nextDouble();

        System.out.print("Enter the 4th employee salary Rs. ");
        double salary4 = scan.nextDouble();

        System.out.println("Average is - " + (salary1 + salary2 + salary3 + salary4) / 4);
    }
}

