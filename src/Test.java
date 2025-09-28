import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dbPassword = 12;

        for (int p = 0; p < 5; p++) {
            System.out.print("enter password: ");
            int password = scan.nextInt();

            if (password == dbPassword) {
                System.out.println("success");
                break;
            } else {
                System.out.println("try again");
            }
            if (p == 4) {
                System.out.println("locked");
            }
        }
    }
}
