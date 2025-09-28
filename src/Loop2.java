import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.print("enter the salary: ");
            total += scan.nextDouble();
            System.out.println("total salary is " + (total));

            if (total >= 200000) {
                break;
            }
        }

    }
}