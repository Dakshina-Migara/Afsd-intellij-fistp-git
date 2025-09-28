import java.util.Scanner;

public class Age_and_name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the boy name: ");
        String boyName = scan.next();

        System.out.print("Enter the Age of boy: ");
        int boyAge = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the girl " + (i + 1) + " name: ");
            String girlName = scan.next();

            System.out.print("Enter the Age of Girl: ");
            int girlAge = scan.nextInt();

            char boyName1 = boyName.charAt(0);
            int boyLetter1 = boyName1;

            char girlName1 = girlName.charAt(0);
            int girlLetter2 = girlName1;

            if (boyLetter1 >= girlLetter2 && boyAge > girlAge) {
                System.out.println("matched");
                break;

            }
            if (i == 9) {
                System.out.println("un matched ");
            }
        }
    }
}
