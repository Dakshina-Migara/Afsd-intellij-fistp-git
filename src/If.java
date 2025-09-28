import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String userName = scan.next();

        System.out.print("Enter the age: ");
        int userAge = scan.nextInt();

        System.out.print("Enter the status of married(yes/no): ");
        String userRelations = scan.next();
        boolean married = userRelations.equalsIgnoreCase("no");

        if (userAge >= 18) {
            char firstLetter = userName.charAt(0);
            int firstLetter1 = firstLetter;

            if (firstLetter1 >= 70 && userRelations.contentEquals("no")) {
                System.out.println("you are eligible to interview");
            } else {
                System.out.println("you are not eligible to interview");
            }
        } else {
            System.out.println("you are not eligible,age is not enough");
        }
    }
}
