import java.util.Scanner;

public class Pactice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the first value:");
        int val1 = scan.nextInt();

        System.out.print("enter the second value:");
        int val2 = scan.nextInt();

        if (val1 == val2) {
            System.out.println("samanai");
        } else if (val1 > val2) {
            System.out.println("lokui");
        } else {
            System.out.println("asamanai");
        }
    }
}
