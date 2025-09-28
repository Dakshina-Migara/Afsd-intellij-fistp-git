import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your name: ");
        String userName = scan.next();

        System.out.print("enter your age: ");
        int userAge = scan.nextInt();

        while (userAge > 100) {
            System.out.print("you age is over exist,try another age:");
            userAge = scan.nextInt();
        }

        System.out.print("enter your address: ");
        String userAddress = scan.next();

        System.out.print("enter your tel.number: ");
        int userTel = scan.nextInt();
    }
}

